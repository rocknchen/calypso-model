package com.hthk.calypsox.model.staticdata.book;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/15 17:47
 */
@FieldOrder({"bookCategory", "bookName", "accessType", "accessDesc"})
public class BookAccess {

    @CSVField(header = "Book Category")
    private String bookCategory;

    @CSVField(header = "Book Name")
    private String bookName;

    @CSVField(header = "Access Type")
    private String accessType;

    @CSVField(header = "Authorized Users")
    private String accessDesc;

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
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

    public String getAccessDesc() {
        return accessDesc;
    }

    public void setAccessDesc(String accessDesc) {
        this.accessDesc = accessDesc;
    }
}
