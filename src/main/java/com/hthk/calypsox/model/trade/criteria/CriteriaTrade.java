package com.hthk.calypsox.model.trade.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/2 15:58
 */
@Criteria(actions = {GET, COUNT}, type = TRADE, appName = ApplicationEnum.CALYPSO)
public class CriteriaTrade extends com.hthk.fintech.model.finance.trade.criteria.CriteriaTrade {

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
