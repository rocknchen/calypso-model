package com.hthk.calypsox.model.person;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/17 9:15
 */
@FieldOrder({"userName", "fullName", "description", "userGroup"})
public class UserInfoVO {

    @CSVField(header = "User Name")
    private String userName;

    @CSVField(header = "Full Name")
    private String fullName;

    @CSVField(header = "Description")
    private String description;

    @CSVField(header = "User Group")
    private String userGroup;

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

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }
}
