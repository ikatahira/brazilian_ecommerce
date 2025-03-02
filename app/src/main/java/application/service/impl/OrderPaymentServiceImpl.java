package application.service.impl;

import application.model.OrderPayment;
import application.repository.OrderPaymentRepository;
import application.service.OrderPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPaymentServiceImpl implements OrderPaymentService {

    @Autowired
    private OrderPaymentRepository orderPaymentRepository;

    @Override
    public List<OrderPayment> getAllOrderPayments() {
        return orderPaymentRepository.findAll();
    }

    @Override
    public OrderPayment getOrderPaymentById(String id) {
        return orderPaymentRepository.findById(id).orElse(null);
    }

    @Override
    public void saveOrderPayment(OrderPayment orderPayment) {
        orderPaymentRepository.save(orderPayment);
    }

    @Override
    public void deleteOrderPayment(String id) {
        orderPaymentRepository.deleteById(id);
    }
}