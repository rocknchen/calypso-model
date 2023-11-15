package com.hthk.calypsox.model.trade;

import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/15 11:52
 */
public interface ITrade {

    String getId();

    String getExternalReference();

    String getInternalReference();

    String getBook();

    String getCounterParty();

    String getBuySell();

    String getProductType();

    String getProductSubtype();

    LocalDateTime getTradeDateTime();

}
