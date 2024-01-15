package com.hthk.calypsox.model.marketdata.quote.eod;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 11:56
 */
@FieldOrder({"date", "quoteName", "quoteType",
        "bid", "ask", "open",
        "close", "high", "low",
        "last", "enteredDate", "enteredUser",
        "knownDate", "sourceName"})
public class EODQuote {

    @CSVField(header = "date")
    private LocalDate date;

    @CSVField(header = "quoteName")
    private String quoteName;

    @CSVField(header = "quoteType")
    private String quoteType;

    @CSVField(header = "bid")
    private BigDecimal bid;

    @CSVField(header = "ask")
    private BigDecimal ask;

    @CSVField(header = "open")
    private BigDecimal open;

    @CSVField(header = "close")
    private BigDecimal close;

    @CSVField(header = "high")
    private BigDecimal high;

    @CSVField(header = "low")
    private BigDecimal low;

    @CSVField(header = "last")
    private BigDecimal last;

    @CSVField(header = "enteredDate")
    private LocalDateTime enteredDate;

    @CSVField(header = "enteredUser")
    private String enteredUser;

    @CSVField(header = "knownDate")
    private LocalDate knownDate;

    @CSVField(header = "sourceName")
    private String sourceName;

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public LocalDateTime getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(LocalDateTime enteredDate) {
        this.enteredDate = enteredDate;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public LocalDate getKnownDate() {
        return knownDate;
    }

    public void setKnownDate(LocalDate knownDate) {
        this.knownDate = knownDate;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }
}
