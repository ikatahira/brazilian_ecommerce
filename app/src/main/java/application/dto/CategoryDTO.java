package application.dto;

public class CategoryDTO {
    private String id;
    private String name;

    // Construtor padrão
    public CategoryDTO() {}

    // Construtor com todos os campos
    public CategoryDTO(String id, String name) {
        this.id = id;
        this.name = name;
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
}