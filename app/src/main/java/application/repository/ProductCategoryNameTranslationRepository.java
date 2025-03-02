package application.repository;

import application.model.ProductCategoryNameTranslation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryNameTranslationRepository extends JpaRepository<ProductCategoryNameTranslation, String> {
}