package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.ActivityReview;

import java.util.List;

public interface ActivityReviewRepository extends JpaRepository<ActivityReview, Long> {
    List<ActivityReview> findByActivityId (Long id);

}
