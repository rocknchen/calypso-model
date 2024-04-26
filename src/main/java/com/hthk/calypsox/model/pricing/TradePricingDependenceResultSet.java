package com.hthk.calypsox.model.pricing;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/26 11:58
 */
@JsonPropertyOrder({"count", "list"})
public class TradePricingDependenceResultSet {

    private List<TradePricingDependence> list;

    public TradePricingDependenceResultSet() {
    }

    public TradePricingDependenceResultSet(List<TradePricingDependence> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<TradePricingDependence> getList() {
        return list;
    }

}
