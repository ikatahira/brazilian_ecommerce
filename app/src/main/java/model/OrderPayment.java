package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "order_payments")
public class OrderPayment {

    @Id
    private String orderId;
    private Integer paymentSequential;
    private String paymentType;
    private Integer paymentInstallments;
    private BigDecimal paymentValue;

    // Construtores
    public OrderPayment() {}

    public OrderPayment(String orderId, Integer paymentSequential, String paymentType, Integer paymentInstallments, BigDecimal paymentValue) {
        this.orderId = orderId;
        this.paymentSequential = paymentSequential;
        this.paymentType = paymentType;
        this.paymentInstallments = paymentInstallments;
        this.paymentValue = paymentValue;
    }

    // Getters e Setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public Integer getPaymentSequential() { return paymentSequential; }
    public void setPaymentSequential(Integer paymentSequential) { this.paymentSequential = paymentSequential; }

    public String getPaymentType() { return paymentType; }
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }

    public Integer getPaymentInstallments() { return paymentInstallments; }
    public void setPaymentInstallments(Integer paymentInstallments) { this.paymentInstallments = paymentInstallments; }

    public BigDecimal getPaymentValue() { return paymentValue; }
    public void setPaymentValue(BigDecimal paymentValue) { this.paymentValue = paymentValue; }
}