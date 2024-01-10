package com.hthk.calypsox.model.pricing;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/10 16:23
 */
@JsonPropertyOrder({"tradeId", "pricingResultMap"})
public class TradePricingInfo {

    private Long tradeId;

    private Map<String, PricingResult> pricingResultMap;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Map<String, PricingResult> getPricingResultMap() {
        return pricingResultMap;
    }

    public void setPricingResultMap(Map<String, PricingResult> pricingResultMap) {
        this.pricingResultMap = pricingResultMap;
    }
}
