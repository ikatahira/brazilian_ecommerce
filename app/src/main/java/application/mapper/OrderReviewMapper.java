package application.mapper;

import application.dto.OrderReviewDTO;
import application.model.OrderReview;

public class OrderReviewMapper {
    public static OrderReviewDTO toDTO(OrderReview orderReview) {
        return new OrderReviewDTO(
            orderReview.getId(),
            orderReview.getOrderId(),
            orderReview.getReviewText(),
            orderReview.getRating()
        );
    }

    public static OrderReview toEntity(OrderReviewDTO dto) {
        return new OrderReview(
            dto.getId(),
            dto.getOrderId(),
            dto.getReviewText(),
            dto.getRating()
        );
    }
}