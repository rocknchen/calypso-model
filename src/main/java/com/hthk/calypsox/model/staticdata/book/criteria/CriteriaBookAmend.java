package com.hthk.calypsox.model.staticdata.book.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.STATIC_DATA;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.AMEND;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/20 13:08
 */
@Criteria(actions = {AMEND}, type = STATIC_DATA, subType1 = "BOOK", appName = ApplicationEnum.CALYPSO)
public class CriteriaBookAmend {

    private String name;

    private String bookAccessCurrency;

    private String bookCurrencyPair;

    private String bookProduct;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookAccessCurrency() {
        return bookAccessCurrency;
    }

    public void setBookAccessCurrency(String bookAccessCurrency) {
        this.bookAccessCurrency = bookAccessCurrency;
    }

    public String getBookCurrencyPair() {
        return bookCurrencyPair;
    }

    public void setBookCurrencyPair(String bookCurrencyPair) {
        this.bookCurrencyPair = bookCurrencyPair;
    }

    public String getBookProduct() {
        return bookProduct;
    }

    public void setBookProduct(String bookProduct) {
        this.bookProduct = bookProduct;
    }

}
