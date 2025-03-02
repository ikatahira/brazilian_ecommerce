package application.service;

import application.dto.ProductDTO;
import java.util.List;

public interface ProductService {

    /**
     * Retrieve all products in the system.
     * 
     * @return List of ProductDTO representing all products.
     */
    List<ProductDTO> getAllProducts();

    /**
     * Retrieve a product by its unique ID.
     * 
     * @param id the unique identifier of the product.
     * @return the ProductDTO for the given ID.
     */
    ProductDTO getProductById(String id);

    /**
     * Save a new product in the system.
     * 
     * @param productDTO the data transfer object containing product details.
     */
    void saveProduct(ProductDTO productDTO);

    /**
     * Update an existing product's information.
     * 
     * @param id the unique identifier of the product to update.
     * @param productDTO the data transfer object containing updated product details.
     */
    void updateProduct(String id, ProductDTO productDTO);

    /**
     * Delete a product from the system.
     * 
     * @param id the unique identifier of the product to delete.
     */
    void deleteProduct(String id);
}