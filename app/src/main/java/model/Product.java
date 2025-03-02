// application/model/Product.java
package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private String productId;
    private String productCategoryName;
    private int productNameLength;
    private int productDescriptionLength;

    // Getters e Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public int getProductNameLength() {
        return productNameLength;
    }

    public void setProductNameLength(int productNameLength) {
        this.productNameLength = productNameLength;
    }

    public int getProductDescriptionLength() {
        return productDescriptionLength;
    }

    public void setProductDescriptionLength(int productDescriptionLength) {
        this.productDescriptionLength = productDescriptionLength;
    }
    
}