// OrderReviewController.java
package application.controller;

import application.dto.OrderReviewDTO;
import application.model.OrderReview;
import application.service.OrderReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-reviews")
public class OrderReviewController {

    @Autowired
    private OrderReviewService orderReviewService;

    @GetMapping("/{id}")
    public ResponseEntity<OrderReviewDTO> getOrderReviewById(@PathVariable String id) {
        OrderReviewDTO orderReview = orderReviewService.getOrderReviewById(id);
        return (orderReview != null) ? ResponseEntity.ok(orderReview) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<OrderReviewDTO>> getAllOrderReviews() {
        List<OrderReviewDTO> orderReviews = orderReviewService.getAllOrderReviews();
        return ResponseEntity.ok(orderReviews);
    }

    @PostMapping
    public ResponseEntity<Void> saveOrderReview(@RequestBody OrderReview orderReview) {
        orderReviewService.saveOrderReview(orderReview);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderReview(@PathVariable String id) {
        orderReviewService.deleteOrderReview(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateOrderReview(@PathVariable String id, @RequestBody OrderReviewDTO orderReviewDTO) {
        orderReviewService.updateOrderReview(id, orderReviewDTO);
        return ResponseEntity.noContent().build();
    }
}