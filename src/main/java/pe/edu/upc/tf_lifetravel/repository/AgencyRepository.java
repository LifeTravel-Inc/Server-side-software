package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.Agency;

import java.util.List;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
    List<Agency> findByEmail (String email);
}
