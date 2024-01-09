package com.hthk.calypsox.model.position;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/8 17:09
 */
@JsonPropertyOrder({"count", "list"})
public class CashPositionInfoResultSet {

    private List<CashPositionInfo> list;

    public CashPositionInfoResultSet() {
    }

    public CashPositionInfoResultSet(List<CashPositionInfo> list) {
        this.list = list;
    }

    public List<CashPositionInfo> getList() {
        return list;
    }

    public void setList(List<CashPositionInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

}
