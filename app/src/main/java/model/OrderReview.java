package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "order_reviews")
public class OrderReview {

    @Id
    private String reviewId;
    private String orderId;
    private int reviewScore;
    private LocalDate reviewCreationDate;

    // Getters e Setters
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public LocalDate getReviewCreationDate() {
        return reviewCreationDate;
    }

    public void setReviewCreationDate(LocalDate reviewCreationDate) {
        this.reviewCreationDate = reviewCreationDate;
    }
}