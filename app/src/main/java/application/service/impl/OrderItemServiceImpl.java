package application.service.impl;

import application.dto.OrderItemDTO;
import application.mapper.OrderItemMapper;
import application.model.OrderItem;
import application.repository.OrderItemRepository;
import application.service.OrderItemService;
import application.service.exception.OrderItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<OrderItemDTO> getAllOrderItems() {
        return orderItemRepository.findAll().stream()
            .map(OrderItemMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public OrderItemDTO getOrderItemById(String id) {
        OrderItem orderItem = orderItemRepository.findById(id)
            .orElseThrow(() -> new OrderItemNotFoundException("Order item not found with id: " + id));
        return OrderItemMapper.toDTO(orderItem);
    }

    @Override
    public void saveOrderItem(OrderItemDTO orderItemDTO) {
        OrderItem orderItem = OrderItemMapper.toEntity(orderItemDTO);
        orderItemRepository.save(orderItem);
    }

    @Override
    public void updateOrderItem(String id, OrderItemDTO orderItemDTO) {
        if (!orderItemRepository.existsById(id)) {
            throw new OrderItemNotFoundException("Order item not found with id: " + id);
        }
        OrderItem orderItem = OrderItemMapper.toEntity(orderItemDTO);
        orderItem.setId(id); // Preserve original ID
        orderItemRepository.save(orderItem);
    }

    @Override
    public void deleteOrderItem(String id) {
        if (!orderItemRepository.existsById(id)) {
            throw new OrderItemNotFoundException("Order item not found with id: " + id);
        }
        orderItemRepository.deleteById(id);
    }
}