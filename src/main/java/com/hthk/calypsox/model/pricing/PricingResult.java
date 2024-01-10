package com.hthk.calypsox.model.pricing;

import java.math.BigDecimal;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/10 16:35
 */
public class PricingResult {

    private String name;

    private boolean valid;

    private BigDecimal amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
