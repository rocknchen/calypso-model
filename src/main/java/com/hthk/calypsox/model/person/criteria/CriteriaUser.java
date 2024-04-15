package com.hthk.calypsox.model.person.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import java.util.List;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.USER;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.GET;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/15 15:39
 */
@Criteria(actions = {GET}, type = USER, appName = ApplicationEnum.CALYPSO)
public class CriteriaUser {

    private List<String> userNameList;

    public List<String> getUserNameList() {
        return userNameList;
    }

    public void setUserNameList(List<String> userNameList) {
        this.userNameList = userNameList;
    }
}
