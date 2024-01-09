package com.hthk.calypsox.model.trade;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 13:58
 */
@JsonPropertyOrder({"count", "list"})
public class TradeInfoResultSet {

    private List<TradeInfo> list;

    public TradeInfoResultSet() {
    }

    public TradeInfoResultSet(List<TradeInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<TradeInfo> getList() {
        return list;
    }
}
