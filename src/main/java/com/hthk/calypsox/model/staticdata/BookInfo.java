package com.hthk.calypsox.model.staticdata;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/8 12:07
 */
public class BookInfo {


    private long id;

    private String name;

    private String activity;

    private String baseCurrency;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
