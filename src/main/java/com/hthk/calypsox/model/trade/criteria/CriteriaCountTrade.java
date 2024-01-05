package com.hthk.calypsox.model.trade.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 12:09
 */
@Criteria(action = COUNT, type = TRADE, appName = ApplicationEnum.CALYPSO)
public class CriteriaCountTrade extends com.hthk.fintech.model.finance.trade.criteria.CriteriaGetTrade {

    private String tradeFilter;

    private List<String> bookList;

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public String getTradeFilter() {
        return tradeFilter;
    }

    public void setTradeFilter(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }
}