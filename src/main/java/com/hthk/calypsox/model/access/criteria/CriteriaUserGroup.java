package com.hthk.calypsox.model.access.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.USER_GROUP;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/24 11:20
 */
@Criteria(actions = {GET}, type = USER_GROUP, appName = ApplicationEnum.CALYPSO)
public class CriteriaUserGroup {

    private List<String> nameList;

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }
}
