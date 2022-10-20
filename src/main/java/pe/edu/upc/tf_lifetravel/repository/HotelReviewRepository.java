package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.HotelReview;

import java.util.List;

public interface HotelReviewRepository extends JpaRepository<HotelReview, Long> {
    List<HotelReview> findByHotelId (Long id);
}
