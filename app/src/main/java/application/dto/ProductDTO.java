package application.service;

import application.dto.ProductDTO;
import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO getProductById(String id);
    void saveProduct(ProductDTO productDTO);
    void updateProduct(String id, ProductDTO productDTO);
    void deleteProduct(String id);
}