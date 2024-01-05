package com.hthk.calypsox.model.marketdata.quote.eod;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 11:56
 */
public class EODQuote {

    private String quoteName;

    private LocalDate date;

    private BigDecimal close;

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
