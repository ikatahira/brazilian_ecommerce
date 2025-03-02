package application.service;

import application.dto.OrderItemDTO;
import java.util.List;

public interface OrderItemService {
    List<OrderItemDTO> getAllOrderItems();
    OrderItemDTO getOrderItemById(String id);
    void saveOrderItem(OrderItemDTO orderItemDTO);
    void updateOrderItem(String id, OrderItemDTO orderItemDTO);
    void deleteOrderItem(String id);
}