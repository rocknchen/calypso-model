package com.hthk.calypsox.model.staticdata.fxrate.definition;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/5 16:10
 */
public class FXRateResetDefinition {

    private String id;

    private String name;

    private String prim;

    private String sec;

    private String rateSource;

    private Integer resetDays;

    private boolean preferred;

    private String timeZone;

    private String resetHour;

    private List<String> resetHolidays;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getRateSource() {
        return rateSource;
    }

    public void setRateSource(String rateSource) {
        this.rateSource = rateSource;
    }

    public Integer getResetDays() {
        return resetDays;
    }

    public void setResetDays(Integer resetDays) {
        this.resetDays = resetDays;
    }

    public boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getResetHour() {
        return resetHour;
    }

    public void setResetHour(String resetHour) {
        this.resetHour = resetHour;
    }

    public List<String> getResetHolidays() {
        return resetHolidays;
    }

    public void setResetHolidays(List<String> resetHolidays) {
        this.resetHolidays = resetHolidays;
    }
}