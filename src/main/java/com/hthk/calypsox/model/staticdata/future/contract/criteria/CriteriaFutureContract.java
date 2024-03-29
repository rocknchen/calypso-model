package com.hthk.calypsox.model.staticdata.future.contract.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.time.LocalDate;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.STATIC_DATA;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/9 18:47
 */
//@Criteria(actions = {GET, COUNT}, type = STATIC_DATA, appName = ApplicationEnum.CALYPSO)
public class CriteriaFutureContract {

    private String name;

    private String currency;

    private LocalDate expirationStart;

    private LocalDate expirationEnd;

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
