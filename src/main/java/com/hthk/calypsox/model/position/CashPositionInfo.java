package com.hthk.calypsox.model.position;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.math.BigDecimal;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/8 17:10
 */
@JsonPropertyOrder({"book", "currency", "flowType",
        "productType", "settleDate", "positionAgg", "amount"})
@FieldOrder({"book", "currency", "flowType",
        "productType", "settleDate", "positionAgg", "amount"})
public class CashPositionInfo {

    @CSVField(header = "book")
    private String book;

    @CSVField(header = "currency")
    private String currency;

    @CSVField(header = "flowType")
    private String flowType;

    @CSVField(header = "productType")
    private String productType;

    @CSVField(header = "settleDate")
    private String settleDate;

    @CSVField(header = "positionAgg")
    private String positionAgg;

    @CSVField(header = "amount")
    private BigDecimal amount;

    public String getPositionAgg() {
        return positionAgg;
    }

    public void setPositionAgg(String positionAgg) {
        this.positionAgg = positionAgg;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
