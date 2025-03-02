package application.service;

import application.dto.SellerDTO;
import java.util.List;

public interface SellerService {
    List<SellerDTO> getAllSellers();
    SellerDTO getSellerById(String id);
    void saveSeller(SellerDTO sellerDTO);
    void updateSeller(String id, SellerDTO sellerDTO);
    void deleteSeller(String id);
}