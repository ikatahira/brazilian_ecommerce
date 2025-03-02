package application.service.impl;

import application.exception.OrderReviewNotFoundException;
import application.model.OrderReview;
import application.repository.OrderReviewRepository;
import application.service.OrderReviewService;
import application.mapper.OrderReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderReviewServiceImpl implements OrderReviewService {

    @Autowired
    private OrderReviewRepository orderReviewRepository;

    @Override
    public OrderReviewDTO getOrderReviewById(String id) {
        OrderReview orderReview = orderReviewRepository.findById(id)
                .orElseThrow(() -> new OrderReviewNotFoundException("Order review not found with id: " + id));
        return OrderReviewMapper.toDTO(orderReview);
    }

    @Override
    public List<OrderReviewDTO> getAllOrderReviews() {
        List<OrderReview> orderReviews = orderReviewRepository.findAll();
        return orderReviews.stream()
                .map(OrderReviewMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void saveOrderReview(OrderReview orderReview) {
        orderReviewRepository.save(orderReview);
    }

    @Override
    public void deleteOrderReview(String id) {
        OrderReview orderReview = orderReviewRepository.findById(id)
                .orElseThrow(() -> new OrderReviewNotFoundException("Order review not found with id: " + id));
        orderReviewRepository.delete(orderReview);
    }
}