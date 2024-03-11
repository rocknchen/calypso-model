package com.hthk.calypsox.model.staticdata.fxrate.definition;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/5 16:10
 */
@FieldOrder({"id", "name", "prim",
        "sec", "rateSource", "resetDays",
        "preferred", "timeZone", "resetHour",
        "resetHolidays"})
@JsonPropertyOrder({"id", "name", "prim",
        "sec", "rateSource", "resetDays",
        "preferred", "timeZone", "resetHour",
        "resetHolidays"})
public class FXRateResetDefinitionInfo {

    @CSVField(header = "id")
    private String id;

    @CSVField(header = "name")
    private String name;

    @CSVField(header = "prim")
    private String prim;

    @CSVField(header = "sec")
    private String sec;

    @CSVField(header = "rateSource")
    private String rateSource;

    @CSVField(header = "resetDays")
    private Integer resetDays;

    @CSVField(header = "preferred")
    private boolean preferred;

    @CSVField(header = "timeZone")
    private String timeZone;

    @CSVField(header = "resetHour")
    private String resetHour;

    @CSVField(header = "resetHolidays")
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
