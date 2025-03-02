package application.controller;

import application.model.ProductCategoryNameTranslation;
import application.service.ProductCategoryNameTranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category-translations")
public class ProductCategoryNameTranslationController {

    @Autowired
    private ProductCategoryNameTranslationService categoryTranslationService;

    @GetMapping
    public String getAllCategoryTranslations(Model model) {
        List<ProductCategoryNameTranslation> categories = categoryTranslationService.getAllCategoryTranslations();
        model.addAttribute("categories", categories);
        return "category-translation-list";
    }

    @GetMapping("/{id}")
    public String getCategoryTranslationById(@PathVariable String id, Model model) {
        ProductCategoryNameTranslation category = categoryTranslationService.getCategoryTranslationById(id);
        if (category != null) {
            model.addAttribute("category", category);
            return "category-translation-detail";
        }
        return "redirect:/category-translations";
    }

    @GetMapping("/create")
    public String createCategoryTranslationForm(Model model) {
        model.addAttribute("category", new ProductCategoryNameTranslation());
        return "category-translation-form";
    }

    @PostMapping("/create")
    public String createCategoryTranslation(@ModelAttribute ProductCategoryNameTranslation category) {
        categoryTranslationService.saveCategoryTranslation(category);
        return "redirect:/category-translations";
    }

    @GetMapping("/edit/{id}")
    public String editCategoryTranslationForm(@PathVariable String id, Model model) {
        ProductCategoryNameTranslation category = categoryTranslationService.getCategoryTranslationById(id);
        if (category != null) {
            model.addAttribute("category", category);
            return "category-translation-form";
        }
        return "redirect:/category-translations";
    }

    @PostMapping("/edit")
    public String editCategoryTranslation(@ModelAttribute ProductCategoryNameTranslation category) {
        categoryTranslationService.saveCategoryTranslation(category);
        return "redirect:/category-translations";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategoryTranslation(@PathVariable String id) {
        categoryTranslationService.deleteCategoryTranslation(id);
        return "redirect:/category-translations";
    }
}