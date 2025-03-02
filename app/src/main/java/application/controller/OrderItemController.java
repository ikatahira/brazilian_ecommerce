package application.controller;

import application.model.OrderItem;
import application.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public String getAllOrderItems(Model model) {
        List<OrderItem> orderItems = orderItemService.getAllOrderItems();
        model.addAttribute("orderItems", orderItems);
        return "orderitem-list";
    }

    @GetMapping("/{id}")
    public String getOrderItemById(@PathVariable String id, Model model) {
        OrderItem orderItem = orderItemService.getOrderItemById(id);
        if (orderItem != null) {
            model.addAttribute("orderItem", orderItem);
            return "orderitem-detail";
        }
        return "redirect:/order-items";
    }

    @GetMapping("/create")
    public String createOrderItemForm(Model model) {
        model.addAttribute("orderItem", new OrderItem());
        return "orderitem-form";
    }

    @PostMapping("/create")
    public String createOrderItem(@ModelAttribute OrderItem orderItem) {
        orderItemService.saveOrderItem(orderItem);
        return "redirect:/order-items";
    }

    @GetMapping("/edit/{id}")
    public String editOrderItemForm(@PathVariable String id, Model model) {
        OrderItem orderItem = orderItemService.getOrderItemById(id);
        if (orderItem != null) {
            model.addAttribute("orderItem", orderItem);
            return "orderitem-form";
        }
        return "redirect:/order-items";
    }

    @PostMapping("/edit")
    public String editOrderItem(@ModelAttribute OrderItem orderItem) {
        orderItemService.saveOrderItem(orderItem);
        return "redirect:/order-items";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrderItem(@PathVariable String id) {
        orderItemService.deleteOrderItem(id);
        return "redirect:/order-items";
    }
}