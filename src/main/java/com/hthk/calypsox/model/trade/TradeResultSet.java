package com.hthk.calypsox.model.trade;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 20:47
 */
@JsonPropertyOrder({"count", "tradeList"})
public class TradeResultSet {

    private List<ITrade> tradeList;

    public TradeResultSet() {
    }

    public TradeResultSet(List<ITrade> tradeList) {
        this.tradeList = tradeList;
    }

    public long getCount() {
        return Optional.ofNullable(tradeList).map(t -> t.size()).orElse(0);
    }

    public List<ITrade> getTradeList() {
        return tradeList;
    }

}
