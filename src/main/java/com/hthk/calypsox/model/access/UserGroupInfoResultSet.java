package com.hthk.calypsox.model.access;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/24 11:16
 */
@JsonPropertyOrder({"count", "list"})
public class UserGroupInfoResultSet {

    private List<UserGroupInfo> list;

    public UserGroupInfoResultSet() {
    }

    public UserGroupInfoResultSet(List<UserGroupInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<UserGroupInfo> getList() {
        return list;
    }

}
