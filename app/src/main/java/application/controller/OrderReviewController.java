package application.controller;

import application.dto.OrderReviewDTO;
import application.model.OrderReview;
import application.service.OrderReviewService;
import application.mapper.OrderReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order-reviews")
public class OrderReviewController {

    @Autowired
    private OrderReviewService orderReviewService;

    @GetMapping
    public ResponseEntity<List<OrderReviewDTO>> getAllOrderReviews() {
        List<OrderReviewDTO> orderReviews = orderReviewService.getAllOrderReviews();
        return new ResponseEntity<>(orderReviews, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderReviewDTO> getOrderReviewById(@PathVariable String id) {
        OrderReviewDTO orderReviewDTO = orderReviewService.getOrderReviewById(id);
        if (orderReviewDTO != null) {
            return new ResponseEntity<>(orderReviewDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<OrderReviewDTO> createOrderReview(@RequestBody OrderReviewDTO orderReviewDTO) {
        OrderReview orderReview = OrderReviewMapper.toEntity(orderReviewDTO);
        orderReviewService.saveOrderReview(orderReview);
        return new ResponseEntity<>(OrderReviewMapper.toDTO(orderReview), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderReviewDTO> updateOrderReview(@PathVariable String id, @RequestBody OrderReviewDTO orderReviewDTO) {
        OrderReview orderReview = OrderReviewMapper.toEntity(orderReviewDTO);
        orderReview.setId(id);
        orderReviewService.saveOrderReview(orderReview);
        return new ResponseEntity<>(OrderReviewMapper.toDTO(orderReview), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteOrderReview(@PathVariable String id) {
        orderReviewService.deleteOrderReview(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}