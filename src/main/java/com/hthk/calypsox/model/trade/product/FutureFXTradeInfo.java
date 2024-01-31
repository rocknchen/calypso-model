package com.hthk.calypsox.model.trade.product;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: Rock CHEN
 * @Date: 2024/1/9 20:57
 */
@FieldOrder({"book", "counterParty", "productType", "productSubType",
        "tradeId", "externalReference", "internalReference",
        "tickerExchange", "bbTickerExchange", "quoteName",
        "buySell", "price", "quantity", "tradeStatus",
        "tradeDate", "tradeDateTime", "settleDate",
        "firstTradeDate", "firstDeliveryDate", "expirationDate"})
public class FutureFXTradeInfo {

    @CSVField(header = "book")
    private String book;

    @CSVField(header = "counterParty")
    private String counterParty;

    @CSVField(header = "productType")
    private String productType;

    @CSVField(header = "productSubType")
    private String productSubType;

    @CSVField(header = "tradeId")
    private String tradeId;

    @CSVField(header = "externalReference")
    private String externalReference;

    @CSVField(header = "internalReference")
    private String internalReference;

    @CSVField(header = "tickerExchange")
    private String tickerExchange;

    @CSVField(header = "bbTickerExchange")
    private String bbTickerExchange;

    @CSVField(header = "quoteName")
    private String quoteName;

    @CSVField(header = "buySell")
    private String buySell;

    @CSVField(header = "price")
    private BigDecimal price;

    @CSVField(header = "quantity")
    private BigDecimal quantity;

    @CSVField(header = "tradeStatus")
    private String tradeStatus;

    @CSVField(header = "tradeDate")
    private LocalDate tradeDate;

    @CSVField(header = "tradeDateTime")
    private LocalDateTime tradeDateTime;

    @CSVField(header = "settleDate")
    private LocalDate settleDate;

    @CSVField(header = "firstTradeDate")
    private LocalDate firstTradeDate;

    @CSVField(header = "firstDeliveryDate")
    private LocalDate firstDeliveryDate;

    @CSVField(header = "expirationDate")
    private LocalDate expirationDate;

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getBbTickerExchange() {
        return bbTickerExchange;
    }

    public void setBbTickerExchange(String bbTickerExchange) {
        this.bbTickerExchange = bbTickerExchange;
    }

    public LocalDateTime getTradeDateTime() {
        return tradeDateTime;
    }

    public void setTradeDateTime(LocalDateTime tradeDateTime) {
        this.tradeDateTime = tradeDateTime;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
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

    public String getTickerExchange() {
        return tickerExchange;
    }

    public void setTickerExchange(String tickerExchange) {
        this.tickerExchange = tickerExchange;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    public LocalDate getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(LocalDate settleDate) {
        this.settleDate = settleDate;
    }

    public LocalDate getFirstTradeDate() {
        return firstTradeDate;
    }

    public void setFirstTradeDate(LocalDate firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    public LocalDate getFirstDeliveryDate() {
        return firstDeliveryDate;
    }

    public void setFirstDeliveryDate(LocalDate firstDeliveryDate) {
        this.firstDeliveryDate = firstDeliveryDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }
}
