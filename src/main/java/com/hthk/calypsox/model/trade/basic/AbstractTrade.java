package com.hthk.calypsox.model.trade.basic;

import com.hthk.calypsox.model.trade.ITrade;

import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 19:38
 */
public abstract class AbstractTrade implements ITrade {

    protected String id;

    protected String externalReference;

    protected String internalReference;

    protected String book;

    protected String counterParty;

    protected String buySell;

    protected String productType;

    protected String productSubtype;

    protected LocalDateTime tradeDateTime;

    @Override
    public LocalDateTime getTradeDateTime() {
        return tradeDateTime;
    }

    public void setTradeDateTime(LocalDateTime tradeDateTime) {
        this.tradeDateTime = tradeDateTime;
    }

    @Override
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    @Override
    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    @Override
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String getProductSubtype() {
        return productSubtype;
    }

    public void setProductSubtype(String productSubtype) {
        this.productSubtype = productSubtype;
    }

    @Override
    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    @Override
    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

}
