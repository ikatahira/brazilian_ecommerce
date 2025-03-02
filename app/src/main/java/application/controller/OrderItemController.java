package application.controller;

import application.dto.OrderItemDTO;
import application.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItemDTO>> getAllOrderItems() {
        List<OrderItemDTO> orderItems = orderItemService.getAllOrderItems();
        return new ResponseEntity<>(orderItems, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItemDTO> getOrderItemById(@PathVariable String id) {
        OrderItemDTO orderItem = orderItemService.getOrderItemById(id);
        if (orderItem != null) {
            return new ResponseEntity<>(orderItem, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<OrderItemDTO> saveOrderItem(@RequestBody OrderItemDTO orderItemDTO) {
        orderItemService.saveOrderItem(orderItemDTO);
        return new ResponseEntity<>(orderItemDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItemDTO> updateOrderItem(@PathVariable String id, @RequestBody OrderItemDTO orderItemDTO) {
        orderItemService.updateOrderItem(id, orderItemDTO);
        return new ResponseEntity<>(orderItemDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteOrderItem(@PathVariable String