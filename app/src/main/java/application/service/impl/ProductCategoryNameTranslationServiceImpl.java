package application.service.impl;

import application.dto.ProductCategoryNameTranslationDTO;
import application.model.ProductCategoryNameTranslation;
import application.repository.ProductCategoryNameTranslationRepository;
import application.service.ProductCategoryNameTranslationService;
import application.mapper.ProductCategoryNameTranslationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryNameTranslationServiceImpl implements ProductCategoryNameTranslationService {

    @Autowired
    private ProductCategoryNameTranslationRepository categoryTranslationRepository;

    @Override
    public List<ProductCategoryNameTranslationDTO> getAllTranslations() {
        List<ProductCategoryNameTranslation> translations = categoryTranslationRepository.findAll();
        return translations.stream()
                .map(ProductCategoryNameTranslationMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductCategoryNameTranslationDTO getTranslationById(String id) {
        ProductCategoryNameTranslation translation = categoryTranslationRepository.findById(id).orElse(null);
        return ProductCategoryNameTranslationMapper.toDTO(translation);
    }

    @Override
    public void saveTranslation(ProductCategoryNameTranslationDTO translationDTO) {
        ProductCategoryNameTranslation translation = ProductCategoryNameTranslationMapper.toEntity(translationDTO);
        categoryTranslationRepository.save(translation);
    }

    @Override
    public void updateTranslation(String id, ProductCategoryNameTranslationDTO translationDTO) {
        ProductCategoryNameTranslation translation = categoryTranslationRepository.findById(id).orElse(null);
        if (translation != null) {
            translation.setProductCategoryName(translationDTO.getProductCategoryName());
            translation.setProductCategoryNameEnglish(translationDTO.getProductCategoryNameEnglish());
            categoryTranslationRepository.save(translation);
        }
    }

    @Override
    public void deleteTranslation(String id) {
        categoryTranslationRepository.deleteById(id);
    }
}