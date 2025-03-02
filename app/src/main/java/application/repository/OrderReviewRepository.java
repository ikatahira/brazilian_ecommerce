package application.repository;

import application.model.OrderReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReviewRepository extends JpaRepository<OrderReview, String> {
}