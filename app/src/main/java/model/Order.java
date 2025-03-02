package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String orderId;
    private String customerId;
    private String orderStatus;
    private LocalDateTime orderPurchaseTimestamp;
    private LocalDateTime orderApprovedAt;
    private LocalDateTime orderDeliveredCarrierDate;
    private LocalDateTime orderDeliveredCustomerDate;
    private LocalDateTime orderEstimatedDeliveryDate;

    // Construtor padrão
    public Order() {
    }

    // Construtor completo
    public Order(String orderId, String customerId, String orderStatus, LocalDateTime orderPurchaseTimestamp, LocalDateTime orderApprovedAt, LocalDateTime orderDeliveredCarrierDate, LocalDateTime orderDeliveredCustomerDate, LocalDateTime orderEstimatedDeliveryDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
        this.orderApprovedAt = orderApprovedAt;
        this.orderDeliveredCarrierDate = orderDeliveredCarrierDate;
        this.orderDeliveredCustomerDate = orderDeliveredCustomerDate;
        this.orderEstimatedDeliveryDate = orderEstimatedDeliveryDate;
    }

    // Getters e Setters
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    public String getId() {
        return orderId;
    }

    public void setId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return orderStatus;
    }
}