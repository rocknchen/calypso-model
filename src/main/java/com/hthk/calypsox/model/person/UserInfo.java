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
