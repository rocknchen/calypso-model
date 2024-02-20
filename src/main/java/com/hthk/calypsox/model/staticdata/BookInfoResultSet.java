package com.hthk.calypsox.model.staticdata;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/20 9:43
 */
@JsonPropertyOrder({"count", "list"})
public class BookInfoResultSet {

    private List<BookInfo> list;

    public BookInfoResultSet() {
    }

    public BookInfoResultSet(List<BookInfo> list) {
        this.list = list;
    }

    //    @JsonIgnore
    public long getCount() {
        return Optional.ofNullable(list).map(t -> t.size()).orElse(0);
    }

    public List<BookInfo> getList() {
        return list;
    }
}
