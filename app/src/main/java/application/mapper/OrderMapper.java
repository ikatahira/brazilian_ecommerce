package application.mapper;
import application.dto.OrderDTO;
import application.model.Order;

import java.time.LocalDateTime;

public class OrderMapper {

    public static OrderDTO toDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setOrderId(order.getOrderId());
        dto.setCustomerId(order.getCustomerId());
        dto.setOrderPurchaseTimestamp(order.getOrderPurchaseTimestamp());
        dto.setOrderApprovedAt(order.getOrderApprovedAt());
        dto.setOrderDeliveredCarrierDate(order.getOrderDeliveredCarrierDate());
        dto.setOrderDeliveredCustomerDate(order.getOrderDeliveredCustomerDate());
        dto.setOrderEstimatedDeliveryDate(order.getOrderEstimatedDeliveryDate());
        return dto;
    }

    public static Order toEntity(OrderDTO dto) {
        Order order = new Order();
        order.setOrderId(dto.getOrderId());
        order.setCustomerId(dto.getCustomerId());
        order.setOrderPurchaseTimestamp(dto.getOrderPurchaseTimestamp());
        order.setOrderApprovedAt(dto.getOrderApprovedAt());
        order.setOrderDeliveredCarrierDate(dto.getOrderDeliveredCarrierDate());
        order.setOrderDeliveredCustomerDate(dto.getOrderDeliveredCustomerDate());
        order.setOrderEstimatedDeliveryDate(dto.getOrderEstimatedDeliveryDate());
        return order;
    }
}