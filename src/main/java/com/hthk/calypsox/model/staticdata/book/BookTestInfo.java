package com.hthk.calypsox.model.staticdata.book;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/15 17:51
 */
public class BookTestInfo {

    private int id;

    private String bookName;

    private String category;

    public BookTestInfo(int id, String bookName, String category) {
        this.id = id;
        this.bookName = bookName;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
