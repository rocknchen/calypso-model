package com.hthk.calypsox.model.pricing;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hthk.fintech.model.pricing.TradePricingResultInfo;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/23 15:11
 */
@JsonPropertyOrder({"count", "list"})
public class TradePricingResultInfoResultSet {

    private List<TradePricingResultInfo> list;

    public TradePricingResultInfoResultSet() {
    }

    public TradePricingResultInfoResultSet(List<TradePricingResultInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<TradePricingResultInfo> getList() {
        return list;
    }
}
