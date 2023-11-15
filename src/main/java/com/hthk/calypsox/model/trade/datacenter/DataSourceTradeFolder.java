package com.hthk.calypsox.model.trade.datacenter;

import com.hthk.fintech.model.data.basic.AbstractDataSource;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 15:04
 */
public class DataSourceTradeFolder extends AbstractDataSource {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
