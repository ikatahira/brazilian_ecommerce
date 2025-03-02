package application.service;

import application.dto.OrderReviewDTO;
import java.util.List;

public interface OrderReviewService {

    /**
     * Retrieve all order reviews.
     * 
     * @return List of OrderReviewDTO representing all reviews.
     */
    List<OrderReviewDTO> getAllOrderReviews();

    /**
     * Retrieve an order review by its ID.
     * 
     * @param id the unique identifier of the review.
     * @return the OrderReviewDTO for the given ID.
     */
    OrderReviewDTO getOrderReviewById(String id);

    /**
     * Save a new order review in the system.
     * 
     * @param orderReviewDTO the data transfer object containing order review details.
     */
    void saveOrderReview(OrderReviewDTO orderReviewDTO);

    /**
     * Update an existing order review's information.
     * 
     * @param id the unique identifier of the review to update.
     * @param orderReviewDTO the data transfer object containing updated review details.
     */
    void updateOrderReview(String id, OrderReviewDTO orderReviewDTO);

    /**
     * Delete an order review from the system.
     * 
     * @param id the unique identifier of the review to delete.
     */
    void deleteOrderReview(String id);
}