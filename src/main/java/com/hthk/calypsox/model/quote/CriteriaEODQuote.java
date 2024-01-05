package com.hthk.calypsox.model.quote;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.EOD_QUOTE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COUNT;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 14:29
 */
@Criteria(actions = {GET, COUNT}, type = EOD_QUOTE, appName = ApplicationEnum.CALYPSO)
public class CriteriaEODQuote extends com.hthk.fintech.model.finance.quote.CriteriaEODQuote {

    private String quoteName;

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }
}
