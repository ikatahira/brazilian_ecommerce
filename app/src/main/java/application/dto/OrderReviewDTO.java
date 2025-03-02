package application.dto;

public class OrderReviewDTO {
    private String id;
    private String orderId;
    private String reviewText;
    private Integer rating;

    // Construtor padrão
    public OrderReviewDTO() {}

    // Construtor com todos os campos
    public OrderReviewDTO(String id, String orderId, String reviewText, Integer rating) {
        this.id = id;
        this.orderId = orderId;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}