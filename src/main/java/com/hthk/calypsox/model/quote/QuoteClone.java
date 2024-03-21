package com.hthk.calypsox.model.quote;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/20 20:54
 */
public class QuoteClone {

    private String source;

    private List<String> destList;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getDestList() {
        return destList;
    }

    public void setDestList(List<String> destList) {
        this.destList = destList;
    }
}
