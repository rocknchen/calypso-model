package com.hthk.calypsox.model.staticdata.future.contract;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/9 19:00
 */
@JsonPropertyOrder({"exchange", "name", "currency",
        "bbTicker", "bbTickerExchange", "ticker",
        "tickerExchange", "quoteName", "firstTradeDate",
        "lastTradeDate", "firstDeliveryDate", "lastDeliveryDate",
        "expirationDate"})
public class FutureInfo {

    private String exchange;

    private String name;

    private String currency;

    private String bbTicker;

    private String bbTickerExchange;

    private String ticker;

    private String tickerExchange;

    private String quoteName;

    private LocalDate firstTradeDate;

    private LocalDate lastTradeDate;

    private LocalDate firstDeliveryDate;

    private LocalDate lastDeliveryDate;

    private LocalDate expirationDate;

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBbTicker() {
        return bbTicker;
    }

    public void setBbTicker(String bbTicker) {
        this.bbTicker = bbTicker;
    }

    public String getBbTickerExchange() {
        return bbTickerExchange;
    }

    public void setBbTickerExchange(String bbTickerExchange) {
        this.bbTickerExchange = bbTickerExchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTickerExchange() {
        return tickerExchange;
    }

    public void setTickerExchange(String tickerExchange) {
        this.tickerExchange = tickerExchange;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public LocalDate getFirstTradeDate() {
        return firstTradeDate;
    }

    public void setFirstTradeDate(LocalDate firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    public LocalDate getLastTradeDate() {
        return lastTradeDate;
    }

    public void setLastTradeDate(LocalDate lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    public LocalDate getFirstDeliveryDate() {
        return firstDeliveryDate;
    }

    public void setFirstDeliveryDate(LocalDate firstDeliveryDate) {
        this.firstDeliveryDate = firstDeliveryDate;
    }

    public LocalDate getLastDeliveryDate() {
        return lastDeliveryDate;
    }

    public void setLastDeliveryDate(LocalDate lastDeliveryDate) {
        this.lastDeliveryDate = lastDeliveryDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

}
