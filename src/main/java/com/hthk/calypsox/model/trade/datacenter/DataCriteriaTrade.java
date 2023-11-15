package com.hthk.calypsox.model.trade.datacenter;

import com.hthk.fintech.model.data.datacenter.query.DataCriteria;
import com.hthk.fintech.model.trade.datacenter.AbstractTradeCriteria;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.TRADE;
import static com.hthk.fintech.model.software.app.ApplicationEnum.CALYPSO;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 12:17
 */
@DataCriteria(sourceName = CALYPSO, entityType = TRADE)
public class DataCriteriaTrade

        extends AbstractTradeCriteria {

    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

}
