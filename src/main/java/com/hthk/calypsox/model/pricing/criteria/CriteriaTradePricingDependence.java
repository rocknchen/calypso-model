package com.hthk.calypsox.model.pricing.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.VALUATION_DEPENDENCY;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/26 12:01
 */
@Criteria(actions = {GET}, type = VALUATION_DEPENDENCY, appName = ApplicationEnum.CALYPSO)
public class CriteriaTradePricingDependence {

    private List<String> tradeFilterList;

    private String valuationTime;

    private String strategy;

    public List<String> getTradeFilterList() {
        return tradeFilterList;
    }

    public void setTradeFilterList(List<String> tradeFilterList) {
        this.tradeFilterList = tradeFilterList;
    }

    public String getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(String valuationTime) {
        this.valuationTime = valuationTime;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
