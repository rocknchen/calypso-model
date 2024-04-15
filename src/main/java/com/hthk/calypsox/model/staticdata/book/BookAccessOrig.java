package com.hthk.calypsox.model.staticdata.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/15 17:57
 */
public class BookAccessOrig {

    private String bookName;

    private String accessType;

    private List<String> accessList;

    public BookAccessOrig(String bookName, String accessType) {
        this.bookName = bookName;
        this.accessType = accessType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public List<String> getAccessList() {
        return accessList;
    }

    public void addAccess(String access) {
        this.accessList = Optional.ofNullable(this.accessList).orElse(new ArrayList<>());
        this.accessList.add(access);
    }
}
