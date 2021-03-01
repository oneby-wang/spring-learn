package com.oneby.entity;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/23 20:27
 * @Version 1.0
 */
public class Book {

    private Integer bookId;
    private String bookName;
    private String bookCategory;

    public Book() {
    }

    public Book(String bookName, String bookCategory) {
        this.bookName = bookName;
        this.bookCategory = bookCategory;
    }

    public Book(Integer bookId, String bookName, String bookCategory) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCategory = bookCategory;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                '}';
    }

}

