package application.controller;

import application.model.OrderReview;
import application.service.OrderReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order-reviews")
public class OrderReviewController {

    @Autowired
    private OrderReviewService orderReviewService;

    @GetMapping
    public String getAllOrderReviews(Model model) {
        List<OrderReview> orderReviews = orderReviewService.getAllOrderReviews();
        model.addAttribute("orderReviews", orderReviews);
        return "orderreview-list";
    }

    @GetMapping("/{id}")
    public String getOrderReviewById(@PathVariable String id, Model model) {
        OrderReview orderReview = orderReviewService.getOrderReviewById(id);
        if (orderReview != null) {
            model.addAttribute("orderReview", orderReview);
            return "orderreview-detail";
        }
        return "redirect:/order-reviews";
    }

    @GetMapping("/create")
    public String createOrderReviewForm(Model model) {
        model.addAttribute("orderReview", new OrderReview());
        return "orderreview-form";
    }

    @PostMapping("/create")
    public String createOrderReview(@ModelAttribute OrderReview orderReview) {
        orderReviewService.saveOrderReview(orderReview);
        return "redirect:/order-reviews";
    }

    @GetMapping("/edit/{id}")
    public String editOrderReviewForm(@PathVariable String id, Model model) {
        OrderReview orderReview = orderReviewService.getOrderReviewById(id);
        if (orderReview != null) {
            model.addAttribute("orderReview", orderReview);
            return "orderreview-form";
        }
        return "redirect:/order-reviews";
    }

    @PostMapping("/edit")
    public String editOrderReview(@ModelAttribute OrderReview orderReview) {
        orderReviewService.saveOrderReview(orderReview);
        return "redirect:/order-reviews";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrderReview(@PathVariable String id) {
        orderReviewService.deleteOrderReview(id);
        return "redirect:/order-reviews";
    }
}