package application.service.impl;

import application.dto.OrderItemDTO;
import application.mapper.OrderItemMapper;
import application.model.OrderItem;
import application.repository.OrderItemRepository;
import application.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItemDTO> getAllOrderItems() {
        List<OrderItem> orderItems = orderItemRepository.findAll();
        return orderItems.stream()
                .map(OrderItemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public OrderItemDTO getOrderItemById(String id) {
        OrderItem orderItem = orderItemRepository.findById(id).orElse(null);
        return OrderItemMapper.toDTO(orderItem);
    }

    @Override
    public void saveOrderItem(OrderItemDTO orderItemDTO) {
        OrderItem orderItem = OrderItemMapper.toEntity(orderItemDTO);
        orderItemRepository.save(orderItem);
    }

    @Override
    public void updateOrderItem(String id, OrderItemDTO orderItemDTO) {
        OrderItem orderItem = OrderItemMapper.toEntity(orderItemDTO);
        orderItem.setOrderId(id);
        orderItemRepository.save(orderItem);
    }

    @Override
    public void deleteOrderItem(String id) {
        orderItemRepository.deleteById(id);
    }
}