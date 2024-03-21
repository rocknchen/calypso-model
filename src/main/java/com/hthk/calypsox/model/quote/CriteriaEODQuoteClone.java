package com.hthk.calypsox.model.quote;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.datetime.DateRange;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.EOD_QUOTE;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.*;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/20 20:53
 */
@Criteria(actions = {CLONE}, type = EOD_QUOTE, appName = ApplicationEnum.CALYPSO)
public class CriteriaEODQuoteClone {

    private DateRange dateRange;

    private List<QuoteClone> cloneList;

    public DateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public List<QuoteClone> getCloneList() {
        return cloneList;
    }

    public void setCloneList(List<QuoteClone> cloneList) {
        this.cloneList = cloneList;
    }
}
