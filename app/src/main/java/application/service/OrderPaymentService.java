// OrderPaymentService.java
package application.service;

import application.model.OrderPayment;
import java.util.List;

public interface OrderPaymentService {
    List<OrderPayment> getAllOrderPayments();
    OrderPayment getOrderPaymentById(String id);
    void saveOrderPayment(OrderPayment orderPayment);
    void deleteOrderPayment(String id);
}