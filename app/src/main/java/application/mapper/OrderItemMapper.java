// OrderItemMapper.java
package application.mapper;

import application.dto.OrderItemDTO;
import application.model.OrderItem;

public class OrderItemMapper {

    public static OrderItemDTO toDTO(OrderItem orderItem) {
        OrderItemDTO dto = new OrderItemDTO();
        dto.setOrderId(orderItem.getOrderId());
        dto.setOrderItemId(orderItem.getOrderItemId());
        dto.setProductId(orderItem.getProductId());
        dto.setSellerId(orderItem.getSellerId());
        dto.setShippingLimitDate(orderItem.getShippingLimitDate());
        dto.setPrice(orderItem.getPrice());
        dto.setFreightValue(orderItem.getFreightValue());
        return dto;
    }

    public static OrderItem toEntity(OrderItemDTO dto) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(dto.getOrderId());
        orderItem.setOrderItemId(dto.getOrderItemId());
        orderItem.setProductId(dto.getProductId());
        orderItem.setSellerId(dto.getSellerId());
        orderItem.setShippingLimitDate(dto.getShippingLimitDate());
        orderItem.setPrice(dto.getPrice());
        orderItem.setFreightValue(dto.getFreightValue());
        return orderItem;
    }
}