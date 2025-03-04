// OrderReview.java
package application.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
@Entity
@Table(name = "order_review")

public class OrderReview {
    @Id
    @Column(name = "review_id", nullable = false, unique = true)
    private String reviewId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "review_score", nullable = false)
    private Integer reviewScore;

    @Column(name = "review_comment_title")
    private String reviewCommentTitle;

    @Column(name = "review_comment_message")
    private String reviewCommentMessage;

    @Column(name = "review_creation_date")
    private LocalDateTime reviewCreationDate;

    @Column(name = "review_answer_timestamp")
    private LocalDateTime reviewAnswerTimestamp;
    public OrderReview() {
    }

    public OrderReview(String reviewId, String orderId, Integer reviewScore, String reviewCommentTitle, String reviewCommentMessage, LocalDateTime reviewCreationDate, LocalDateTime reviewAnswerTimestamp) {
        this.reviewId = reviewId;
        this.orderId = orderId;
        this.reviewScore = reviewScore;
        this.reviewCommentTitle = reviewCommentTitle;
        this.reviewCommentMessage = reviewCommentMessage;
        this.reviewCreationDate = reviewCreationDate;
        this.reviewAnswerTimestamp = reviewAnswerTimestamp;
    }

    // Getters e setters
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
}