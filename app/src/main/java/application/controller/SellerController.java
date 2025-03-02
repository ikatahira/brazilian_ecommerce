package application.controller;

import application.model.Seller;
import application.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public String getAllSellers(Model model) {
        List<Seller> sellers = sellerService.getAllSellers();
        model.addAttribute("sellers", sellers);
        return "seller-list";
    }

    @GetMapping("/{id}")
    public String getSellerById(@PathVariable String id, Model model) {
        Seller seller = sellerService.getSellerById(id);
        if (seller != null) {
            model.addAttribute("seller", seller);
            return "seller-detail";
        }
        return "redirect:/sellers";
    }

    @GetMapping("/create")
    public String createSellerForm(Model model) {
        model.addAttribute("seller", new Seller());
        return "seller-form";
    }

    @PostMapping("/create")
    public String createSeller(@ModelAttribute Seller seller) {
        sellerService.saveSeller(seller);
        return "redirect:/sellers";
    }

    @GetMapping("/edit/{id}")
    public String editSellerForm(@PathVariable String id, Model model) {
        Seller seller = sellerService.getSellerById(id);
        if (seller != null) {
            model.addAttribute("seller", seller);
            return "seller-form";
        }
        return "redirect:/sellers";
    }

    @PostMapping("/edit")
    public String editSeller(@ModelAttribute Seller seller) {
        sellerService.saveSeller(seller);
        return "redirect:/sellers";
    }

    @GetMapping("/delete/{id}")
    public String deleteSeller(@PathVariable String id) {
        sellerService.deleteSeller(id);
        return "redirect:/sellers";
    }
}