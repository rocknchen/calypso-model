package com.hthk.calypsox.model.pricing.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/10 16:19
 */
@Criteria(actions = {PRICE}, type = TRADE, appName = ApplicationEnum.CALYPSO)
public class CriteriaPricing {

    private List<Long> tradeIdList;

    private String tradeFilter;

    private List<String> pricingMeasureList;

    public String getTradeFilter() {
        return tradeFilter;
    }

    public void setTradeFilter(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }

    public List<Long> getTradeIdList() {
        return tradeIdList;
    }

    public void setTradeIdList(List<Long> tradeIdList) {
        this.tradeIdList = tradeIdList;
    }

    public List<String> getPricingMeasureList() {
        return pricingMeasureList;
    }

    public void setPricingMeasureList(List<String> pricingMeasureList) {
        this.pricingMeasureList = pricingMeasureList;
    }

}
