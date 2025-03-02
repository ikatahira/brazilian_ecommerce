package application.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderItemDTO {
    private String orderId;
    private Integer orderItemId;
    private String productId;
    private String sellerId;
    private LocalDateTime shippingLimitDate;
    private BigDecimal price;
    private BigDecimal freightValue;

    public OrderItemDTO() {}

    public OrderItemDTO(String orderId, Integer orderItemId, String productId, String sellerId, LocalDateTime shippingLimitDate, BigDecimal price, BigDecimal freightValue) {
        this.orderId = orderId;
        this.orderItemId = orderItemId;
        this.productId = productId;
        this.sellerId = sellerId;
        this.shippingLimitDate = shippingLimitDate;
        this.price = price;
        this.freightValue = freightValue;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public Integer getOrderItemId() { return orderItemId; }
    public void setOrderItemId(Integer orderItemId) { this.orderItemId = orderItemId; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getSellerId() { return sellerId; }
    public void setSellerId(String sellerId) { this.sellerId = sellerId; }

    public LocalDateTime getShippingLimitDate() { return shippingLimitDate; }
    public void setShippingLimitDate(LocalDateTime shippingLimitDate) { this.shippingLimitDate = shippingLimitDate; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getFreightValue() { return freightValue; }
    public void setFreightValue(BigDecimal freightValue) { this.freightValue = freightValue; }
}