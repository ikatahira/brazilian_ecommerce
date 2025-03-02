package application.service;

import application.dto.SellerDTO;
import java.util.List;

public interface SellerService {

    /**
     * Retrieve all sellers in the system.
     * 
     * @return List of SellerDTO representing all sellers.
     */
    List<SellerDTO> getAllSellers();

    /**
     * Retrieve a seller by their unique ID.
     * 
     * @param id the unique identifier of the seller.
     * @return the SellerDTO for the given ID.
     */
    SellerDTO getSellerById(String id);

    /**
     * Save a new seller in the system.
     * 
     * @param sellerDTO the data transfer object containing seller details.
     */
    void saveSeller(SellerDTO sellerDTO);

    /**
     * Update an existing seller's information.
     * 
     * @param id the unique identifier of the seller to update.
     * @param sellerDTO the data transfer object containing updated seller details.
     */
    void updateSeller(String id, SellerDTO sellerDTO);

    /**
     * Delete a seller from the system.
     * 
     * @param id the unique identifier of the seller to delete.
     */
    void deleteSeller(String id);
}