package application.service.impl;

import application.dto.OrderReviewDTO;
import application.model.OrderReview;
import application.repository.OrderReviewRepository;
import application.service.OrderReviewService;
import application.mapper.OrderReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import application.dto.OrderDTO;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderReviewServiceImpl implements OrderReviewService {

    @Autowired
    private OrderReviewRepository orderReviewRepository;

    @Override
    public OrderReviewDTO getOrderReviewById(String id) {
        OrderReview orderReview = orderReviewRepository.findById(id).orElse(null);
        return (orderReview != null) ? OrderReviewMapper.toDTO(orderReview) : null;
    }

    @Override
    public List<OrderReviewDTO> getAllOrderReviews() {
        List<OrderReview> orderReviews = orderReviewRepository.findAll();
        return orderReviews.stream()
                .map(OrderReviewMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void saveOrderReview(OrderReviewDTO orderReviewDTO) {
        OrderReview orderReview = OrderReviewMapper.toEntity(orderReviewDTO);
        orderReviewRepository.save(orderReview);
    }


    @Override
    public void deleteOrderReview(String id) {
        orderReviewRepository.deleteById(id);
    }

    

    @Override
    public void updateOrderReview(String id, OrderReviewDTO orderReviewDTO) {
        OrderReview orderReview = orderReviewRepository.findById(id).orElse(null);
        if (orderReview != null) {
            OrderReview updatedOrderReview = OrderReviewMapper.toEntity(orderReviewDTO);
            updatedOrderReview.setReviewId(orderReview.getReviewId());
            orderReviewRepository.save(updatedOrderReview);
        }
    }

}