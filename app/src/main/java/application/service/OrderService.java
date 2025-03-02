package application.service;

import application.model.Order;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(String id);
    void saveOrder(Order order);
    void deleteOrder(String id);
}