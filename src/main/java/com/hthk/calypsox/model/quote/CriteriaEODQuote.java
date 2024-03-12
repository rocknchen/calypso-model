package com.hthk.calypsox.model.quote;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.EOD_QUOTE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 14:29
 */
@Criteria(actions = {GET, COUNT, SYNCHRONIZE}, type = EOD_QUOTE, appName = ApplicationEnum.CALYPSO)
public class CriteriaEODQuote extends com.hthk.fintech.model.finance.quote.CriteriaEODQuote {

    private String quoteName;

    private List<String> quoteNameList;

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public List<String> getQuoteNameList() {
        return quoteNameList;
    }

    public void setQuoteNameList(List<String> quoteNameList) {
        this.quoteNameList = quoteNameList;
    }
}
