package application.mapper;

import application.dto.OrderDTO;
import application.model.Order;

public class OrderMapper {
    public static OrderDTO toDTO(Order order) {
        if (order == null) {
            return null;
        }
        return new OrderDTO(order.getId(), order.getCustomer().getId(), order.getTotalAmount());
    }

    public static Order toEntity(OrderDTO orderDTO) {
        if (orderDTO == null) {
            return null;
        }
        Order order = new Order();
        order.setId(orderDTO.getId());
        // Assumindo que haja mecanismos para setar o Cliente a partir do ID
        order.setTotalAmount(orderDTO.getTotalAmount());
        return order;
    }
}