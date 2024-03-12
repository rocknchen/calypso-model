package com.hthk.calypsox.model.marketdata.quote.eod;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/11 16:50
 */
@FieldOrder({"quoteName", "quoteType", "close", "lastClose", "diff", "date", "lastDate"})
public class EODQuoteCompare {

    @CSVField(header = "quoteName")
    private String quoteName;

    @CSVField(header = "quoteType")
    private String quoteType;

    @CSVField(header = "close")
    private BigDecimal close;

    @CSVField(header = "lastClose")
    private BigDecimal lastClose;

    @CSVField(header = "daily difference")
    private String diff;

    @CSVField(header = "date")
    private LocalDate date;

    @CSVField(header = "lastDate")
    private LocalDate lastDate;

    public EODQuoteCompare() {
    }

    public EODQuoteCompare(String quoteName, String quoteType, BigDecimal close, BigDecimal lastClose, String diff, LocalDate date, LocalDate lastDate) {
        this.quoteName = quoteName;
        this.quoteType = quoteType;
        this.close = close;
        this.lastClose = lastClose;
        this.diff = diff;
        this.date = date;
        this.lastDate = lastDate;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public BigDecimal getLastClose() {
        return lastClose;
    }

    public void setLastClose(BigDecimal lastClose) {
        this.lastClose = lastClose;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }
}
