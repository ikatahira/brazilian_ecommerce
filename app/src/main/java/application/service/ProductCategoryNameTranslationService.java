package application.service;

import application.dto.ProductCategoryNameTranslationDTO;
import java.util.List;

public interface ProductCategoryNameTranslationService {

    /**
     * Retrieve all product category translations.
     * 
     * @return List of ProductCategoryNameTranslationDTO representing all translations.
     */
    List<ProductCategoryNameTranslationDTO> getAllTranslations();

    /**
     * Retrieve a product category translation by its ID.
     * 
     * @param id the unique identifier of the translation.
     * @return the ProductCategoryNameTranslationDTO for the given ID.
     */
    ProductCategoryNameTranslationDTO getTranslationById(String id);

    /**
     * Save a new product category translation in the system.
     * 
     * @param translationDTO the data transfer object containing translation details.
     */
    void saveTranslation(ProductCategoryNameTranslationDTO translationDTO);

    /**
     * Update an existing product category translation.
     * 
     * @param id the unique identifier of the translation to update.
     * @param translationDTO the data transfer object containing updated translation details.
     */
    void updateTranslation(String id, ProductCategoryNameTranslationDTO translationDTO);

    /**
     * Delete a product category translation from the system.
     * 
     * @param id the unique identifier of the translation to delete.
     */
    void deleteTranslation(String id);
}