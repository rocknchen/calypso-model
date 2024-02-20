package com.hthk.calypsox.model.staticdata.book.criteria;

import com.hthk.fintech.model.common.Criteria;
import com.hthk.fintech.model.software.app.ApplicationEnum;

import static com.hthk.fintech.model.data.datacenter.query.EntityTypeEnum.STATIC_DATA;
import static com.hthk.fintech.model.web.http.ActionTypeEnum.COPY_ADD;

/**
 * @Author: Rock CHEN
 * @Date: 2024/2/20 9:38
 */
@Criteria(actions = {COPY_ADD}, type = STATIC_DATA, subType1 = "BOOK", appName = ApplicationEnum.CALYPSO)
public class CriteriaBookCopyAdd {

    private String source;

    private String ext;

    private int offSet;

    private int count;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
