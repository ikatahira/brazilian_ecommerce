package application.mapper;

import application.dto.ProductCategoryNameTranslationDTO;
import application.model.ProductCategoryNameTranslation;

public class ProductCategoryNameTranslationMapper {

    public static ProductCategoryNameTranslationDTO toDTO(ProductCategoryNameTranslation entity) {
        if (entity == null) {
            return null;
        }
        ProductCategoryNameTranslationDTO dto = new ProductCategoryNameTranslationDTO();
        dto.setProductCategoryName(entity.getProductCategoryName());
        dto.setProductCategoryNameEnglish(entity.getProductCategoryNameEnglish());
        return dto;
    }

    public static ProductCategoryNameTranslation toEntity(ProductCategoryNameTranslationDTO dto) {
        if (dto == null) {
            return null;
        }
        ProductCategoryNameTranslation entity = new ProductCategoryNameTranslation();
        entity.setProductCategoryName(dto.getProductCategoryName());
        entity.setProductCategoryNameEnglish(dto.getProductCategoryNameEnglish());
        return entity;
    }
}