package com.oneby.dao;

import com.oneby.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookDaoImpl
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/23 20:25
 * @Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {

    // 注入 JdbcTemplate 对象
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int addBook(Book book) {
        // 创建 SQL 语句
        String sql = "insert into t_books (book_name, book_category) values (?, ?) ";

        // SQL 语句参数
        Object[] args = {book.getBookName(), book.getBookCategory()};

        // 执行 SQL 语句
        int insertRows = jdbcTemplate.update(sql, args);
        return insertRows;
    }

    @Override
    public int deleteBook(String bookId) {
        // 创建 SQL 语句
        String sql = "delete from t_books where book_id = ?";

        // 执行 SQL 语句
        int deleteRows = jdbcTemplate.update(sql, bookId);
        return deleteRows;
    }

    @Override
    public int updateBook(Book book) {
        // 创建 SQL 语句
        String sql = "update t_books set book_name = ?, book_category = ? where book_id = ?";

        // SQL 语句参数
        Object[] args = {book.getBookName(), book.getBookCategory(), book.getBookId()};

        // 执行 SQL 语句
        int insertRows = jdbcTemplate.update(sql, args);
        return insertRows;
    }

    @Override
    public Book findBookInfo(int bookId) {
        // 创建 SQL 语句
        String sql = "select * from t_books where book_id = ?";

        // 执行 SQL 语句
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), bookId);
        return book;
    }

    @Override
    public int findBookCount() {
        // 创建 SQL 语句
        String sql = "select count(*) from t_books";

        // 执行 SQL 语句
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Book> findAllBookInfo() {
        // 创建 SQL 语句
        String sql = "select * from t_books";

        // 执行 SQL 语句
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public int[] batchAddBook(List<Book> books) {
        // 创建 SQL 语句
        String sql = "insert into t_book (book_name, book_category) values (?, ?)";

        // 构造参数
        List<Object[]> batchArgs = new ArrayList<>();
        for (Book book : books) {
            batchArgs.add(new Object[]{book.getBookName(), book.getBookCategory()});
        }

        // 批量执行
        int[] batchAffectedRows = jdbcTemplate.batchUpdate(sql, batchArgs);
        return batchAffectedRows;
    }

    @Override
    public int[] batchUpdateBook(List<Book> books) {
        // 创建 SQL 语句
        String sql = "update t_books set book_name = ?, book_category = ? where book_id = ?";

        // 构造参数
        List<Object[]> batchArgs = new ArrayList<>();
        for (Book book : books) {
            batchArgs.add(new Object[]{book.getBookName(), book.getBookCategory(), book.getBookId()});
        }

        // 批量执行
        int[] batchAffectedRows = jdbcTemplate.batchUpdate(sql, batchArgs);
        return batchAffectedRows;
    }

    @Override
    public int[] batchDeleteBook(List<Integer> bookIds) {
        // 创建 SQL 语句
        String sql = "delete from t_books where book_id = ?";

        // 构造参数
        List<Object[]> batchArgs = new ArrayList<>();
        for (Integer bookId : bookIds) {
            batchArgs.add(new Object[]{bookId});
        }

        // 批量执行
        int[] batchAffectedRows = jdbcTemplate.batchUpdate(sql, batchArgs);
        return batchAffectedRows;
    }

}
