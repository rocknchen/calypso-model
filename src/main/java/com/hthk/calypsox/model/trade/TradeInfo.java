package com.hthk.calypsox.model.trade;

import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 17:37
 */
public class TradeInfo {

    private String book;

    private LocalDateTime tradeDateTime;

    private String trader;

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
}
