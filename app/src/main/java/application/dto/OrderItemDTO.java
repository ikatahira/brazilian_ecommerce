package application.dto;

public class OrderItemDTO {
    private String id;
    private String productId;
    private Integer quantity;

    // Construtor padrão
    public OrderItemDTO() {}

    // Construtor com todos os campos
    public OrderItemDTO(String id, String productId, Integer quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}