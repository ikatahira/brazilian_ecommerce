package application.controller;

import application.dto.ProductCategoryNameTranslationDTO;
import application.model.ProductCategoryNameTranslation;
import application.service.ProductCategoryNameTranslationService;
import application.mapper.ProductCategoryNameTranslationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product-category-translations")
public class ProductCategoryNameTranslationController {

    @Autowired
    private ProductCategoryNameTranslationService categoryTranslationService;

    @GetMapping
    public ResponseEntity<List<ProductCategoryNameTranslationDTO>> getAllCategoryTranslations() {
        List<ProductCategoryNameTranslationDTO> categories = categoryTranslationService.getAllCategoryTranslations();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryNameTranslationDTO> getCategoryTranslationById(@PathVariable String id) {
        ProductCategoryNameTranslationDTO category = categoryTranslationService.getCategoryTranslationById(id);
        if (category != null) {
            return new ResponseEntity<>(category, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ProductCategoryNameTranslationDTO> createCategoryTranslation(@RequestBody ProductCategoryNameTranslationDTO categoryDTO) {
        ProductCategoryNameTranslation category = ProductCategoryNameTranslationMapper.toEntity(categoryDTO);
        categoryTranslationService.saveCategoryTranslation(category);
        return new ResponseEntity<>(ProductCategoryNameTranslationMapper.toDTO(category), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductCategoryNameTranslationDTO> updateCategoryTranslation(@PathVariable String id, @RequestBody ProductCategoryNameTranslationDTO categoryDTO) {
        ProductCategoryNameTranslation category = ProductCategoryNameTranslationMapper.toEntity(categoryDTO);
        category.setId(id);
        categoryTranslationService.saveCategoryTranslation(category);
        return new ResponseEntity<>(ProductCategoryNameTranslationMapper.toDTO(category), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCategoryTranslation(@PathVariable String id) {
        categoryTranslationService.deleteCategoryTranslation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}