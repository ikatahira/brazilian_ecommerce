package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_category_name_translations")
public class ProductCategoryNameTranslation {

    @Id
    private String categoryId;
    private String categoryEnglishName;

    // Getters e Setters
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryEnglishName() {
        return categoryEnglishName;
    }

    public void setCategoryEnglishName(String categoryEnglishName) {
        this.categoryEnglishName = categoryEnglishName;
    }
}