package com.hthk.calypsox.model.person;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/15 15:40
 */
public class UserInfo {

    private String userName;

    private String fullName;

    private String description;

    private List<String> groupList;

    private List<String> bookReadWrite;

    private List<String> bookReadOnly;

    public List<String> getBookReadWrite() {
        return bookReadWrite;
    }

    public void setBookReadWrite(List<String> bookReadWrite) {
        this.bookReadWrite = bookReadWrite;
    }

    public List<String> getBookReadOnly() {
        return bookReadOnly;
    }

    public void setBookReadOnly(List<String> bookReadOnly) {
        this.bookReadOnly = bookReadOnly;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<String> groupList) {
        this.groupList = groupList;
    }
}
