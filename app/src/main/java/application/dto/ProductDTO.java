package application.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private String id;
    private String name;
    private BigDecimal price;

    // Construtor padrão
    public ProductDTO() {}

    // Construtor com todos os campos
    public ProductDTO(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}