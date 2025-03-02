package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_category_name_translation")
public class ProductCategoryNameTranslation {

    @Id
    private String productCategoryName;
    private String productCategoryNameEnglish;

    // Construtor padrão
    public ProductCategoryNameTranslation() {
    }

    // Construtor completo
    public ProductCategoryNameTranslation(String productCategoryName, String productCategoryNameEnglish) {
        this.productCategoryName = productCategoryName;
        this.productCategoryNameEnglish = productCategoryNameEnglish;
    }

    // Getters e Setters
    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryNameEnglish() {
        return productCategoryNameEnglish;
    }

    public void setProductCategoryNameEnglish(String productCategoryNameEnglish) {
        this.productCategoryNameEnglish = productCategoryNameEnglish;
    }

    public void setId(String id) {
    }

    public String getId() {
        return productCategoryName;
    }
}