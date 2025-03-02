package application.mapper;

import application.dto.ProductDTO;
import application.model.Product;

public class ProductMapper {
    public static ProductDTO toDTO(Product product) {
        if (product == null) {
            return null;
        }
        return new ProductDTO(product.getId(), product.getName(), product.getPrice());
    }

    public static Product toEntity(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        }
        return new Product(productDTO.getId(), productDTO.getName(), productDTO.getPrice());
    }
}