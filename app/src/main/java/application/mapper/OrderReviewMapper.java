// OrderReviewMapper.java
package application.mapper;

import application.dto.OrderReviewDTO;
import application.model.OrderReview;

public class OrderReviewMapper {

    public static OrderReviewDTO toDTO(OrderReview orderReview) {
        OrderReviewDTO dto = new OrderReviewDTO();
        dto.setReviewId(orderReview.getReviewId());
        dto.setOrderId(orderReview.getOrderId());
        dto.setReviewScore(orderReview.getReviewScore());
        dto.setReviewCommentTitle(orderReview.getReviewCommentTitle());
        dto.setReviewCommentMessage(orderReview.getReviewCommentMessage());
        dto.setReviewCreationDate(orderReview.getReviewCreationDate());
        dto.setReviewAnswerTimestamp(orderReview.getReviewAnswerTimestamp());
        return dto;
    }

    public static OrderReview toEntity(OrderReviewDTO dto) {
        OrderReview orderReview = new OrderReview();
        orderReview.setReviewId(dto.getReviewId());
        orderReview.setOrderId(dto.getOrderId());
        orderReview.setReviewScore(dto.getReviewScore());
        orderReview.setReviewCommentTitle(dto.getReviewCommentTitle());
        orderReview.setReviewCommentMessage(dto.getReviewCommentMessage());
        orderReview.setReviewCreationDate(dto.getReviewCreationDate());
        orderReview.setReviewAnswerTimestamp(dto.getReviewAnswerTimestamp());
        return orderReview;
    }
}