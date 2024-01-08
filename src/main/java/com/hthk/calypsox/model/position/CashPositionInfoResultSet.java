package com.hthk.calypsox.model.position;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/8 17:09
 */
public class CashPositionInfoResultSet {

    private List<CashPositionInfo> cashPositionInfoList;

    public CashPositionInfoResultSet() {
    }

    public CashPositionInfoResultSet(List<CashPositionInfo> cashPositionInfoList) {
    }

    public List<CashPositionInfo> getCashPositionInfoList() {
        return cashPositionInfoList;
    }

    public void setCashPositionInfoList(List<CashPositionInfo> cashPositionInfoList) {
        this.cashPositionInfoList = cashPositionInfoList;
    }

    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(cashPositionInfoList).map(t -> t.size()).orElse(0);
    }

}
