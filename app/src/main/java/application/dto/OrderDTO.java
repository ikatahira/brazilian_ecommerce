package application.dto;

import java.math.BigDecimal;

public class OrderDTO {
    private String id;
    private String customerId;
    private BigDecimal totalAmount;

    // Construtor padrão
    public OrderDTO() {}

    // Construtor com todos os campos
    public OrderDTO(String id, String customerId, BigDecimal totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}