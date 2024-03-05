package com.hthk.calypsox.model.staticdata.fxrate.definition.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.STATIC_DATA;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/5 16:06
 */
@Criteria(actions = {GET, COUNT}, type = STATIC_DATA, subType1 = "FX_RATE_RESET", appName = ApplicationEnum.CALYPSO)
public class CriteriaFXRateDef {

    private String primCurrency;

    public String getPrimCurrency() {
        return primCurrency;
    }

    public void setPrimCurrency(String primCurrency) {
        this.primCurrency = primCurrency;
    }
}
