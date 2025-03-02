package application.service;

import application.dto.OrderItemDTO;
import java.util.List;

public interface OrderItemService {

    /**
     * Retrieve all order items.
     * 
     * @return List of OrderItemDTO representing all order items.
     */
    List<OrderItemDTO> getAllOrderItems();

    /**
     * Retrieve a specific order item by its ID.
     * 
     * @param id the unique identifier of the order item.
     * @return the OrderItemDTO for the given ID.
     */
    OrderItemDTO getOrderItemById(String id);

    /**
     * Save a new order item in the system.
     * 
     * @param orderItemDTO the data transfer object containing order item details.
     */
    void saveOrderItem(OrderItemDTO orderItemDTO);

    /**
     * Update an existing order item's information.
     * 
     * @param id the unique identifier of the order item to update.
     * @param orderItemDTO the data transfer object containing updated order item details.
     */
    void updateOrderItem(String id, OrderItemDTO orderItemDTO);

    /**
     * Delete an order item from the system.
     * 
     * @param id the unique identifier of the order item to delete.
     */
    void deleteOrderItem(String id);
}