package com.hthk.calypsox.model.staticdata.future.contract;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/9 18:43
 */
public class FutureContractInfoResultSet {

    private List<FutureContractInfo> list;

    public FutureContractInfoResultSet() {
    }

    public FutureContractInfoResultSet(List<FutureContractInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<FutureContractInfo> getList() {
        return list;
    }

}
