package application.mapper;

import application.dto.OrderItemDTO;
import application.model.OrderItem;

import java.time.LocalDateTime;

public class OrderItemMapper {
    public static OrderItemDTO toDTO(OrderItem orderItem) {
        if (orderItem == null) return null;
        return new OrderItemDTO(
            orderItem.getOrderId(),
            orderItem.getOrderItemId(),
            orderItem.getProductId(),
            orderItem.getSellerId(),
            orderItem.getShippingLimitDate(),
            orderItem.getPrice(),
            orderItem.getFreightValue()
        );
    }

    public static OrderItem toEntity(OrderItemDTO dto) {
        if (dto == null) return null;
        return new OrderItem(
            dto.getOrderId(),
            dto.getOrderItemId(),
            dto.getProductId(),
            dto.getSellerId(),
            dto.getShippingLimitDate(),
            dto.getPrice(),
            dto.getFreightValue()
        );
    }
}