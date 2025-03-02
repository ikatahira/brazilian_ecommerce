package application.service.impl;

import application.dto.SellerDTO;
import application.mapper.SellerMapper;
import application.model.Seller;
import application.repository.SellerRepository;
import application.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public List<SellerDTO> getAllSellers() {
        List<Seller> sellers = sellerRepository.findAll();
        return sellers.stream()
                .map(SellerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SellerDTO getSellerById(String id) {
        Seller seller = sellerRepository.findById(id).orElse(null);
        return SellerMapper.toDTO(seller);
    }

    @Override
    public void saveSeller(SellerDTO sellerDTO) {
        Seller seller = SellerMapper.toEntity(sellerDTO);
        sellerRepository.save(seller);
    }

    @Override
    public void updateSeller(String id, SellerDTO sellerDTO) {
        Seller seller = SellerMapper.toEntity(sellerDTO);
        seller.setSellerId(id);
        sellerRepository.save(seller);
    }

    @Override
    public void deleteSeller(String id) {
        sellerRepository.deleteById(id);
    }
}