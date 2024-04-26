package com.hthk.calypsox.model.pricing;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/26 11:58
 */
public class TradePricingDependence {

    private String tradeId;

    private LocalDateTime valuationDateTime;

    private List<String> dependenceInstanceNameList;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public LocalDateTime getValuationDateTime() {
        return valuationDateTime;
    }

    public void setValuationDateTime(LocalDateTime valuationDateTime) {
        this.valuationDateTime = valuationDateTime;
    }

    public List<String> getDependenceInstanceNameList() {
        return dependenceInstanceNameList;
    }

    public void setDependenceInstanceNameList(List<String> dependenceInstanceNameList) {
        this.dependenceInstanceNameList = dependenceInstanceNameList;
    }
}
