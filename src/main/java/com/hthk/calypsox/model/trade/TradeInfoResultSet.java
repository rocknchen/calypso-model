package com.hthk.calypsox.model.trade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 13:58
 */
@JsonPropertyOrder({"count", "tradeInfoList"})
public class TradeInfoResultSet {

    private List<TradeInfo> tradeInfoList;

    public TradeInfoResultSet() {
    }

    public TradeInfoResultSet(List<TradeInfo> tradeInfoList) {
        this.tradeInfoList = tradeInfoList;
    }

//    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(tradeInfoList).map(t -> t.size()).orElse(0);
    }

    public List<TradeInfo> getTradeInfoList() {
        return tradeInfoList;
    }
}
