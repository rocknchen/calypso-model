package com.hthk.calypsox.model.person;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/15 15:40
 */
@JsonPropertyOrder({"count", "list"})
public class UserInfoResultSet {

    private List<UserInfo> list;

    public UserInfoResultSet() {
    }

    public UserInfoResultSet(List<UserInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<UserInfo> getList() {
        return list;
    }
}
