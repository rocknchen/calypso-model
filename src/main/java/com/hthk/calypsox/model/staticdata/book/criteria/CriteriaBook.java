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

    private int idStart;

    private int idEnd;

    public List<String> getNamePreList() {
        return namePreList;
    }

    public void setNamePreList(List<String> namePreList) {
        this.namePreList = namePreList;
    }

    public int getIdStart() {
        return idStart;
    }

    public void setIdStart(int idStart) {
        this.idStart = idStart;
    }

    public int getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }
}
