package com.hthk.calypsox.model.staticdata.book;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/17 15:22
 */
@FieldOrder({"legalEntity", "department", "tradingDesk", "businessType", "tradingType",
        "bookName", "accessType", "userName", "id", "desc"})
public class BookAccessALl {

    @CSVField(header = "Legal Entity")
    private String legalEntity;

    @CSVField(header = "Department")
    private String department;

    @CSVField(header = "Trading Desk")
    private String tradingDesk;

    @CSVField(header = "业务类别")
    private String businessType;

    @CSVField(header = "交易性质")
    private String tradingType;
    @CSVField(header = "Book Name")
    private String bookName;

    @CSVField(header = "Access Type")
    private String accessType;

    @CSVField(header = "Description")
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTradingDesk() {
        return tradingDesk;
    }

    public void setTradingDesk(String tradingDesk) {
        this.tradingDesk = tradingDesk;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getTradingType() {
        return tradingType;
    }

    public void setTradingType(String tradingType) {
        this.tradingType = tradingType;
    }

    @CSVField(header = "User")
    private String userName;

    @CSVField(header = "id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
