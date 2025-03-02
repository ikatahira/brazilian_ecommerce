package application.service.impl;

import application.dto.ProductCategoryNameTranslationDTO;
import application.mapper.ProductCategoryNameTranslationMapper;
import application.model.ProductCategoryNameTranslation;
import application.repository.ProductCategoryNameTranslationRepository;
import application.service.ProductCategoryNameTranslationService;
import application.service.exception.TranslationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryNameTranslationServiceImpl implements ProductCategoryNameTranslationService {

    private final ProductCategoryNameTranslationRepository repository;

    @Autowired
    public ProductCategoryNameTranslationServiceImpl(ProductCategoryNameTranslationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductCategoryNameTranslationDTO> getAllTranslations() {
        return repository.findAll().stream()
            .map(ProductCategoryNameTranslationMapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public ProductCategoryNameTranslationDTO getTranslationById(String id) {
        ProductCategoryNameTranslation translation = repository.findById(id)
            .orElseThrow(() -> new TranslationNotFoundException("Translation not found with id: " + id));
        return ProductCategoryNameTranslationMapper.toDTO(translation);
    }

    @Override
    public void saveTranslation(ProductCategoryNameTranslationDTO translationDTO) {
        ProductCategoryNameTranslation translation = ProductCategoryNameTranslationMapper.toEntity(translationDTO);
        repository.save(translation);
    }

    @Override
    public void updateTranslation(String id, ProductCategoryNameTranslationDTO translationDTO) {
        if (!repository.existsById(id)) {
            throw new TranslationNotFoundException("Translation not found with id: " + id);
        }
        ProductCategoryNameTranslation translation = ProductCategoryNameTranslationMapper.toEntity(translationDTO);
        translation.setId(id); // Preserve original ID
        repository.save(translation);
    }

    @Override
    public void deleteTranslation(String id) {
        if (!repository.existsById(id)) {
            throw new TranslationNotFoundException("Translation not found with id: " + id);
        }
        repository.deleteById(id);
    }
}