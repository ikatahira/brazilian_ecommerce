package application.mapper;

import application.dto.OrderItemDTO;
import application.model.OrderItem;

public class OrderItemMapper {
    public static OrderItemDTO toDTO(OrderItem orderItem) {
        if (orderItem == null) return null;
        return new OrderItemDTO(orderItem.getId(), orderItem.getProductId(), orderItem.getQuantity());
    }

    public static OrderItem toEntity(OrderItemDTO dto) {
        if (dto == null) return null;
        return new OrderItem(dto.getId(), dto.getProductId(), dto.getQuantity());
    }
}