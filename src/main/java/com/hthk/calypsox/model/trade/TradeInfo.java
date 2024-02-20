package com.hthk.calypsox.model.trade;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/8 11:31
 */
@JsonPropertyOrder({"book", "counterParty", "tradeId",
        "externalReference", "internalReference", "productType",
        "productSubType", "productExtType", "tradeDateTime",
        "settlementDate", "buySell", "price",
        "quantity", "tradeStatus", "trader",
        "enteredUser", "enteredDateTime", "futureUnderlyingTickerExchange",
        "futureUnderlyingBBTickerExchange", "longNote1"})
public class TradeInfo {

    private String book;

    private String counterParty;

    private String tradeId;

    private String externalReference;

    private String internalReference;

    private String productType;

    private String productSubType;

    private String productExtType;

    private LocalDateTime tradeDateTime;

    private LocalDate settlementDate;

    private String buySell;

    private BigDecimal price;

    private String quantity;

    private String tradeStatus;

    private String trader;

    private String enteredUser;

    private LocalDateTime enteredDateTime;

    private String futureUnderlyingTickerExchange;

    private String futureUnderlyingBBTickerExchange;

    private String longNote1;

    public String getLongNote1() {
        return longNote1;
    }

    public void setLongNote1(String longNote1) {
        this.longNote1 = longNote1;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public LocalDateTime getEnteredDateTime() {
        return enteredDateTime;
    }

    public void setEnteredDateTime(LocalDateTime enteredDateTime) {
        this.enteredDateTime = enteredDateTime;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFutureUnderlyingBBTickerExchange() {
        return futureUnderlyingBBTickerExchange;
    }

    public void setFutureUnderlyingBBTickerExchange(String futureUnderlyingBBTickerExchange) {
        this.futureUnderlyingBBTickerExchange = futureUnderlyingBBTickerExchange;
    }

    public String getFutureUnderlyingTickerExchange() {
        return futureUnderlyingTickerExchange;
    }

    public void setFutureUnderlyingTickerExchange(String futureUnderlyingTickerExchange) {
        this.futureUnderlyingTickerExchange = futureUnderlyingTickerExchange;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    public String getProductExtType() {
        return productExtType;
    }

    public void setProductExtType(String productExtType) {
        this.productExtType = productExtType;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(LocalDate settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public LocalDateTime getTradeDateTime() {
        return tradeDateTime;
    }

    public void setTradeDateTime(LocalDateTime tradeDateTime) {
        this.tradeDateTime = tradeDateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}