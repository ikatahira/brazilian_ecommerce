package application.mapper;

import application.dto.ProductDTO;
import application.model.Product;

import java.math.BigDecimal;

public class ProductMapper {
    public static ProductDTO toDTO(Product product) {
        if (product == null) return null;
        return new ProductDTO(
            product.getProductId(),
            product.getProductCategoryName(),
            product.getProductNameLength(),
            product.getProductDescriptionLength(),
            product.getProductPhotosQty(),
            product.getProductWeightG(),
            product.getProductLengthCm(),
            product.getProductHeightCm(),
            product.getProductWidthCm()
        );
    }

    public static Product toEntity(ProductDTO dto) {
        if (dto == null) return null;
        return new Product(
            dto.getProductId(),
            dto.getProductCategoryName(),
            dto.getProductNameLength(),
            dto.getProductDescriptionLength(),
            dto.getProductPhotosQty(),
            dto.getProductWeightG(),
            dto.getProductLengthCm(),
            dto.getProductHeightCm(),
            dto.getProductWidthCm()
        );
    }
}