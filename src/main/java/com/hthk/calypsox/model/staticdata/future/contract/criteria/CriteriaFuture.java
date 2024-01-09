package com.hthk.calypsox.model.staticdata.future.contract.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.time.LocalDate;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.STATIC_DATA;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/9 19:01
 */
@Criteria(actions = {GET, COUNT}, type = STATIC_DATA, subType1 = "FUTURE", appName = ApplicationEnum.CALYPSO)
public class CriteriaFuture {

    private String exchange;

    private String name;

    private String currency;

    private LocalDate expirationStart;

    private LocalDate expirationEnd;

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getExpirationStart() {
        return expirationStart;
    }

    public void setExpirationStart(LocalDate expirationStart) {
        this.expirationStart = expirationStart;
    }

    public LocalDate getExpirationEnd() {
        return expirationEnd;
    }

    public void setExpirationEnd(LocalDate expirationEnd) {
        this.expirationEnd = expirationEnd;
    }
}
