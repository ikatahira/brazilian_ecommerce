package application.mapper;

import application.dto.SellerDTO;
import application.model.Seller;

public class SellerMapper {
    public static SellerDTO toDTO(Seller seller) {
        if (seller == null) return null;
        return new SellerDTO(
            seller.getSellerId(),
            seller.getSellerZipCodePrefix(),
            seller.getSellerCity(),
            seller.getSellerState()
        );
    }

    public static Seller toEntity(SellerDTO dto) {
        if (dto == null) return null;
        return new Seller(
            dto.getSellerId(),
            dto.getSellerZipCodePrefix(),
            dto.getSellerCity(),
            dto.getSellerState()
        );
    }
}