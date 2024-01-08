package com.hthk.calypsox.model.position;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/8 17:10
 */
@JsonPropertyOrder({"book"})
public class CashPositionInfo {

    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
