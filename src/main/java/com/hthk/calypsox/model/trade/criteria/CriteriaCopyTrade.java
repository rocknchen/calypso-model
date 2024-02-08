package com.hthk.calypsox.model.trade.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/23 14:51
 */
@Criteria(actions = {COPY_ADD}, type = TRADE, appName = ApplicationEnum.CALYPSO)
public class CriteriaCopyTrade {

    private String tradeFilter;

    private String targetBook;

    private List<Long> tradeIdBlackList;

    public String getTradeFilter() {
        return tradeFilter;
    }

    public void setTradeFilter(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }

    public String getTargetBook() {
        return targetBook;
    }

    public void setTargetBook(String targetBook) {
        this.targetBook = targetBook;
    }

    public List<Long> getTradeIdBlackList() {
        return tradeIdBlackList;
    }

    public void setTradeIdBlackList(List<Long> tradeIdBlackList) {
        this.tradeIdBlackList = tradeIdBlackList;
    }
}
