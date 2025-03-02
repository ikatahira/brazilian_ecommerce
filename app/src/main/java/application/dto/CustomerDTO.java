package application.dto;

public class CustomerDTO {
    private String id;
    private String name;
    private String email;

    // Construtor padrão
    public CustomerDTO() {}

    // Construtor com todos os campos
    public CustomerDTO(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}