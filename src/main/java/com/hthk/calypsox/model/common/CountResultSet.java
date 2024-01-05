package com.hthk.calypsox.model.common;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/5 14:03
 */
@JsonPropertyOrder({"count"})
public class CountResultSet {

    public Long count;

    public CountResultSet() {
    }

    public CountResultSet(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}
