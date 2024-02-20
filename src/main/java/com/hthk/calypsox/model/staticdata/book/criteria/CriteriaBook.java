package com.hthk.calypsox.model.staticdata.book.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.STATIC_DATA;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/20 14:19
 */
@Criteria(actions = {GET}, type = STATIC_DATA, subType1 = "BOOK", appName = ApplicationEnum.CALYPSO)
public class CriteriaBook {

    private List<String> namePreList;

    private Integer idStart;

    private Integer idEnd;

    private String testStatus;

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public List<String> getNamePreList() {
        return namePreList;
    }

    public void setNamePreList(List<String> namePreList) {
        this.namePreList = namePreList;
    }

    public Integer getIdStart() {
        return idStart;
    }

    public void setIdStart(Integer idStart) {
        this.idStart = idStart;
    }

    public Integer getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(Integer idEnd) {
        this.idEnd = idEnd;
    }
}
