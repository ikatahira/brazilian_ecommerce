package application.service.impl;

import application.dto.OrderReviewDTO;
import application.mapper.OrderReviewMapper;
import application.model.OrderReview;
import application.repository.OrderReviewRepository;
import application.service.OrderReviewService;
import application.service.exception.OrderReviewNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderReviewServiceImpl implements OrderReviewService {

    private final OrderReviewRepository orderReviewRepository;

    @Autowired
    public OrderReviewServiceImpl(OrderReviewRepository orderReviewRepository) {
        this.orderReviewRepository = orderReviewRepository;
    }

    @Override
    public List<OrderReviewDTO> getAllOrderReviews() {
        return orderReviewRepository.findAll().stream()
            .map(OrderReviewMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public OrderReviewDTO getOrderReviewById(String id) {
        OrderReview orderReview = orderReviewRepository.findById(id)
            .orElseThrow(() -> new OrderReviewNotFoundException("Order review not found with id: " + id));
        return OrderReviewMapper.toDTO(orderReview);
    }

    @Override
    public void saveOrderReview(OrderReviewDTO orderReviewDTO) {
        OrderReview orderReview = OrderReviewMapper.toEntity(orderReviewDTO);
        orderReviewRepository.save(orderReview);
    }

    @Override
    public void updateOrderReview(String id, OrderReviewDTO orderReviewDTO) {
        if (!orderReviewRepository.existsById(id)) {
            throw new OrderReviewNotFoundException("Order review not found with id: " + id);
        }
        OrderReview orderReview = OrderReviewMapper.toEntity(orderReviewDTO);
        orderReview.setId(id); // Preserve original ID
        orderReviewRepository.save(orderReview);
    }

    @Override
    public void deleteOrderReview(String id) {
        if (!orderReviewRepository.existsById(id)) {
            throw new OrderReviewNotFoundException("Order review not found with id: " + id);
        }
        orderReviewRepository.deleteById(id);
    }
}