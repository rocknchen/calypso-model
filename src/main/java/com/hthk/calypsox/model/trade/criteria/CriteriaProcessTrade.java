package com.hthk.calypsox.model.trade.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/23 15:44
 */
@Criteria(actions = {PROCESS}, type = TRADE, appName = ApplicationEnum.CALYPSO)
public class CriteriaProcessTrade {

    private String tradeFilter;

    private String applyAction;

    public String getTradeFilter() {
        return tradeFilter;
    }

    public void setTradeFilter(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }

    public String getApplyAction() {
        return applyAction;
    }

    public void setApplyAction(String applyAction) {
        this.applyAction = applyAction;
    }
}
