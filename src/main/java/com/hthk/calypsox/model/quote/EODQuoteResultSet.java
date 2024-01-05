package com.hthk.calypsox.model.quote;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hthk.calypsox.model.marketdata.quote.eod.EODQuote;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 14:32
 */
@JsonPropertyOrder({"count", "eodQuoteList"})
public class EODQuoteResultSet {

    private List<EODQuote> eodQuoteList;

    public EODQuoteResultSet() {
    }

    public EODQuoteResultSet(List<EODQuote> eodQuoteList) {
        this.eodQuoteList = eodQuoteList;
    }

    public long getCount() {
        return Optional.ofNullable(eodQuoteList).map(t -> t.size()).orElse(0);
    }

    public List<EODQuote> getEodQuoteList() {
        return eodQuoteList;
    }
}
