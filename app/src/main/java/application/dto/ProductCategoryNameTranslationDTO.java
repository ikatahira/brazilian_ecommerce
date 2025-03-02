package application.dto;

public class ProductCategoryNameTranslationDTO {
    private String id;
    private String categoryId;
    private String language;
    private String translatedName;

    // Construtor padrão
    public ProductCategoryNameTranslationDTO() {}

    // Construtor com todos os campos
    public ProductCategoryNameTranslationDTO(String id, String categoryId, String language, String translatedName) {
        this.id = id;
        this.categoryId = categoryId;
        this.language = language;
        this.translatedName = translatedName;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslatedName() {
        return translatedName;
    }

    public void setTranslatedName(String translatedName) {
        this.translatedName = translatedName;
    }
}