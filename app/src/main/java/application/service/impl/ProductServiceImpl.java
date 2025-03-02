package application.service.impl;

import application.dto.ProductDTO;
import application.mapper.ProductMapper;
import application.model.Product;
import application.repository.ProductRepository;
import application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(ProductMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO getProductById(String id) {
        Product product = productRepository.findById(id).orElse(null);
        return ProductMapper.toDTO(product);
    }

    @Override
    public void saveProduct(ProductDTO productDTO) {
        Product product = ProductMapper.toEntity(productDTO);
        productRepository.save(product);
    }

    @Override
    public void updateProduct(String id, ProductDTO productDTO) {
        Product product = ProductMapper.toEntity(productDTO);
        product.setProductId(id);
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}