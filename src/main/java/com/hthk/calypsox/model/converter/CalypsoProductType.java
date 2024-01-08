package com.hthk.calypsox.model.converter;

import java.util.Objects;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/8 16:02
 */
public class CalypsoProductType {

    private String productType;

    private String productSubType;

    public CalypsoProductType() {
    }

    public CalypsoProductType(String productType, String productSubType) {
        this.productType = productType;
        this.productSubType = productSubType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalypsoProductType that = (CalypsoProductType) o;
        return Objects.equals(productType, that.productType) && Objects.equals(productSubType, that.productSubType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, productSubType);
    }
}
