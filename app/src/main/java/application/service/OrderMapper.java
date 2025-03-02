package application.service.mapper;

import application.model.Order;
import application.dto.OrderDTO;

public class OrderMapper {
    public static OrderDTO toDTO(Order order) {
        return new OrderDTO(order.getId(), order.getCustomerId(), order.getOrderStatus());
    }

    public static Order toEntity(OrderDTO orderDTO) {
        return new Order(orderDTO.getId(), orderDTO.getCustomerId(), orderDTO.getStatus());
    }
}