package com.hthk.calypsox.model.pricing.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.datetime.DateRange;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.DATE_RANGE_PRICE;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/23 15:07
 */
@Criteria(actions = {DATE_RANGE_PRICE}, type = TRADE, appName = ApplicationEnum.CALYPSO)
public class CriteriaDateRangePricing {

    private Long tradeId;

    private String valuationTime;

    private DateRange dateRange;

    private List<String> pricingMeasureList;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(String valuationTime) {
        this.valuationTime = valuationTime;
    }

    public DateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public List<String> getPricingMeasureList() {
        return pricingMeasureList;
    }

    public void setPricingMeasureList(List<String> pricingMeasureList) {
        this.pricingMeasureList = pricingMeasureList;
    }
}
