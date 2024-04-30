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

    private List<String> bookBlackList;

    private List<String> tradeStatusBlackList;

    private List<String> productTypeList;

    public List<String> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<String> productTypeList) {
        this.productTypeList = productTypeList;
    }

    public CriteriaTrade() {
    }

    public CriteriaTrade(String tradeFilter) {
        this.tradeFilter = tradeFilter;
    }

    public List<String> getTradeStatusBlackList() {
        return tradeStatusBlackList;
    }

    public void setTradeStatusBlackList(List<String> tradeStatusBlackList) {
        this.tradeStatusBlackList = tradeStatusBlackList;
    }

    public List<String> getBookBlackList() {
        return bookBlackList;
    }

    public void setBookBlackList(List<String> bookBlackList) {
        this.bookBlackList = bookBlackList;
    }

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
