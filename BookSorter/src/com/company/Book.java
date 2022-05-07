package com.company;

import java.util.Calendar;
import java.util.Date;

public class Book implements Comparable<Book> {

    private String bookName;
    private String authorName;
    private int pageNumber;
    private int releaseDate;

    public Book(String bookName, String authorName, int pageNumber, int releaseDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book book) {
        return (this.getBookName().compareTo(book.getBookName()));
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
