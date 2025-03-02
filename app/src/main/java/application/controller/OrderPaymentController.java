package application.controller;

import application.model.OrderPayment;
import application.service.OrderPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order-payments")
public class OrderPaymentController {

    @Autowired
    private OrderPaymentService orderPaymentService;

    @GetMapping
    public String getAllOrderPayments(Model model) {
        List<OrderPayment> orderPayments = orderPaymentService.getAllOrderPayments();
        model.addAttribute("orderPayments", orderPayments);
        return "orderpayment-list";
    }

    @GetMapping("/{id}")
    public String getOrderPaymentById(@PathVariable String id, Model model) {
        OrderPayment orderPayment = orderPaymentService.getOrderPaymentById(id);
        if (orderPayment != null) {
            model.addAttribute("orderPayment", orderPayment);
            return "orderpayment-detail";
        }
        return "redirect:/order-payments";
    }

    @GetMapping("/create")
    public String createOrderPaymentForm(Model model) {
        model.addAttribute("orderPayment", new OrderPayment());
        return "orderpayment-form";
    }

    @PostMapping("/create")
    public String createOrderPayment(@ModelAttribute OrderPayment orderPayment) {
        orderPaymentService.saveOrderPayment(orderPayment);
        return "redirect:/order-payments";
    }

    @GetMapping("/edit/{id}")
    public String editOrderPaymentForm(@PathVariable String id, Model model) {
        OrderPayment orderPayment = orderPaymentService.getOrderPaymentById(id);
        if (orderPayment != null) {
            model.addAttribute("orderPayment", orderPayment);
            return "orderpayment-form";
        }
        return "redirect:/order-payments";
    }

    @PostMapping("/edit")
    public String editOrderPayment(@ModelAttribute OrderPayment orderPayment) {
        orderPaymentService.saveOrderPayment(orderPayment);
        return "redirect:/order-payments";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrderPayment(@PathVariable String id) {
        orderPaymentService.deleteOrderPayment(id);
        return "redirect:/order-payments";
    }
}