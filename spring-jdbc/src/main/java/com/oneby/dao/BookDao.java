package com.oneby.dao;

import com.oneby.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/23 20:24
 * @Version 1.0
 */
public interface BookDao {

    // 添加一本图书
    public int addBook(Book book);

    // 删除一本图书
    public int deleteBook(String bookId);

    // 更新一本图书的信息
    public int updateBook(Book book);

    // 查询一本图书
    public Book findBookInfo(int bookId);

    // 查询所有图书的数量
    public int findBookCount();

    // 查询所有图书的集合
    public List<Book> findAllBookInfo();

    // 批量添加图书
    public int[] batchAddBook(List<Book> books);

    // 批量修改图书信息
    public int[] batchUpdateBook(List<Book> books);

    // 批量删除图书
    public int[] batchDeleteBook(List<Integer> bookId);

}
