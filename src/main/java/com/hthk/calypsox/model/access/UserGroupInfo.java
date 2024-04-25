package com.hthk.calypsox.model.access;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/24 11:15
 */
@JsonPropertyOrder({"name", "bookReadWriteList", "bookReadOnlyList",
        "bookAttributesReadWriteList", "bookAttributesReadOnlyList",
        "allBookReadWriteList", "allBookReadOnlyList"
})
public class UserGroupInfo {

    private String name;

    private List<String> bookReadWriteList;

    private List<String> bookReadOnlyList;

    private List<String> bookAttributesReadWriteList;

    private List<String> bookAttributesReadOnlyList;

    /**
     * Summary
     */
    private List<String> allBookReadWriteList;

    /**
     * Summary
     */
    private List<String> allBookReadOnlyList;

    public List<String> getAllBookReadWriteList() {
        return allBookReadWriteList;
    }

    public void setAllBookReadWriteList(List<String> allBookReadWriteList) {
        this.allBookReadWriteList = allBookReadWriteList;
    }

    public List<String> getAllBookReadOnlyList() {
        return allBookReadOnlyList;
    }

    public void setAllBookReadOnlyList(List<String> allBookReadOnlyList) {
        this.allBookReadOnlyList = allBookReadOnlyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBookReadWriteList() {
        return bookReadWriteList;
    }

    public void setBookReadWriteList(List<String> bookReadWriteList) {
        this.bookReadWriteList = bookReadWriteList;
    }

    public List<String> getBookReadOnlyList() {
        return bookReadOnlyList;
    }

    public void setBookReadOnlyList(List<String> bookReadOnlyList) {
        this.bookReadOnlyList = bookReadOnlyList;
    }

    public List<String> getBookAttributesReadWriteList() {
        return bookAttributesReadWriteList;
    }

    public void setBookAttributesReadWriteList(List<String> bookAttributesReadWriteList) {
        this.bookAttributesReadWriteList = bookAttributesReadWriteList;
    }

    public List<String> getBookAttributesReadOnlyList() {
        return bookAttributesReadOnlyList;
    }

    public void setBookAttributesReadOnlyList(List<String> bookAttributesReadOnlyList) {
        this.bookAttributesReadOnlyList = bookAttributesReadOnlyList;
    }
}
