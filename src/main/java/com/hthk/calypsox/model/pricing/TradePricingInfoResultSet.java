package com.hthk.calypsox.model.pricing;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/10 16:23
 */
@JsonPropertyOrder({"count", "list"})
public class TradePricingInfoResultSet {

    private List<TradePricingInfo> list;

    public TradePricingInfoResultSet() {
    }

    public TradePricingInfoResultSet(List<TradePricingInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<TradePricingInfo> getList() {
        return list;
    }

}
