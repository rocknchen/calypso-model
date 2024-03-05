package com.hthk.calypsox.model.staticdata.fxrate.definition;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/5 16:09
 */
@JsonPropertyOrder({"count", "list"})
public class FXRateResetDefResultSet {

    private List<FXRateResetDefinitionInfo> list;

    public FXRateResetDefResultSet() {
    }

    public FXRateResetDefResultSet(List<FXRateResetDefinitionInfo> list) {
        this.list = list;
    }

    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<FXRateResetDefinitionInfo> getList() {
        return list;
    }

}
