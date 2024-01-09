package com.hthk.calypsox.model.staticdata.future.contract;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/9 18:59
 */
public class FutureInfoResultSet {

    private List<FutureInfo> list;

    public FutureInfoResultSet() {
    }

    public FutureInfoResultSet(List<FutureInfo> list) {
        this.list = list;
    }

    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<FutureInfo> getList() {
        return list;
    }

}
