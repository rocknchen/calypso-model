package com.hthk.calypsox.model.trade.basic;

import com.hthk.calypsox.model.trade.ITrade;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 19:38
 */
public abstract class AbstractTrade implements ITrade {

    protected String id;

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

}
