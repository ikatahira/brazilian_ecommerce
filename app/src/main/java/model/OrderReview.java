package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_reviews")
public class OrderReview {

    @Id
    private String reviewId;
    private String orderId;
    private Integer reviewScore;
    private String reviewCommentTitle;
    private String reviewCommentMessage;
    private LocalDateTime reviewCreationDate;
    private LocalDateTime reviewAnswerTimestamp;

    // Construtor padrão
    public OrderReview() {
    }

    // Construtor completo
    public OrderReview(String reviewId, String orderId, Integer reviewScore, String reviewCommentTitle, String reviewCommentMessage, LocalDateTime reviewCreationDate, LocalDateTime reviewAnswerTimestamp) {
        this.reviewId = reviewId;
        this.orderId = orderId;
        this.reviewScore = reviewScore;
        this.reviewCommentTitle = reviewCommentTitle;
        this.reviewCommentMessage = reviewCommentMessage;
        this.reviewCreationDate = reviewCreationDate;
        this.reviewAnswerTimestamp = reviewAnswerTimestamp;
    }

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

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getReviewCommentTitle() {
        return reviewCommentTitle;
    }

    public void setReviewCommentTitle(String reviewCommentTitle) {
        this.reviewCommentTitle = reviewCommentTitle;
    }

    public String getReviewCommentMessage() {
        return reviewCommentMessage;
    }

    public void setReviewCommentMessage(String reviewCommentMessage) {
        this.reviewCommentMessage = reviewCommentMessage;
    }

    public LocalDateTime getReviewCreationDate() {
        return reviewCreationDate;
    }

    public void setReviewCreationDate(LocalDateTime reviewCreationDate) {
        this.reviewCreationDate = reviewCreationDate;
    }

    public LocalDateTime getReviewAnswerTimestamp() {
        return reviewAnswerTimestamp;
    }

    public void setReviewAnswerTimestamp(LocalDateTime reviewAnswerTimestamp) {
        this.reviewAnswerTimestamp = reviewAnswerTimestamp;
    }

    public String getId() {
        return reviewId;
    }

    public void setId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewText() {
        return reviewCommentMessage;
    }

    public Integer getRating() {
        return reviewScore;
    }
}