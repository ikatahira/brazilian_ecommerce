// OrderDTO.java
package application.dto;

import java.time.LocalDateTime;

public class OrderDTO {
    private String orderId;
    private String customerId;
    private LocalDateTime orderPurchaseTimestamp;
    private LocalDateTime orderApprovedAt;
    private LocalDateTime orderDeliveredCarrierDate;
    private LocalDateTime orderDeliveredCustomerDate;
    private LocalDateTime orderEstimatedDeliveryDate;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String customerId, LocalDateTime orderPurchaseTimestamp, LocalDateTime orderApprovedAt, LocalDateTime orderDeliveredCarrierDate, LocalDateTime orderDeliveredCustomerDate, LocalDateTime orderEstimatedDeliveryDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
        this.orderApprovedAt = orderApprovedAt;
        this.orderDeliveredCarrierDate = orderDeliveredCarrierDate;
        this.orderDeliveredCustomerDate = orderDeliveredCustomerDate;
        this.orderEstimatedDeliveryDate = orderEstimatedDeliveryDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getOrderPurchaseTimestamp() {
        return orderPurchaseTimestamp;
    }

    public void setOrderPurchaseTimestamp(LocalDateTime orderPurchaseTimestamp) {
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
    }

    public LocalDateTime getOrderApprovedAt() {
        return orderApprovedAt;
    }

    public void setOrderApprovedAt(LocalDateTime orderApprovedAt) {
        this.orderApprovedAt = orderApprovedAt;
    }

    public LocalDateTime getOrderDeliveredCarrierDate() {
        return orderDeliveredCarrierDate;
    }

    public void setOrderDeliveredCarrierDate(LocalDateTime orderDeliveredCarrierDate) {
        this.orderDeliveredCarrierDate = orderDeliveredCarrierDate;
    }

    public LocalDateTime getOrderDeliveredCustomerDate() {
        return orderDeliveredCustomerDate;
    }

    public void setOrderDeliveredCustomerDate(LocalDateTime orderDeliveredCustomerDate) {
        this.orderDeliveredCustomerDate = orderDeliveredCustomerDate;
    }

    public LocalDateTime getOrderEstimatedDeliveryDate() {
        return orderEstimatedDeliveryDate;
    }

    public void setOrderEstimatedDeliveryDate(LocalDateTime orderEstimatedDeliveryDate) {
        this.orderEstimatedDeliveryDate = orderEstimatedDeliveryDate;
    }
}