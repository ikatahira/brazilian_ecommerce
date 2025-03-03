// OrderReviewService.java
package application.service;

import application.dto.OrderReviewDTO;
import application.model.OrderReview;
import java.util.List;

public interface OrderReviewService {
    OrderReviewDTO getOrderReviewById(String id);
    List<OrderReviewDTO> getAllOrderReviews();
    void saveOrderReview(OrderReview orderReview);
    void deleteOrderReview(String id);
    void updateOrderReview(String id, OrderReviewDTO orderReviewDTO);
    
}