package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.Destination;

import java.util.List;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
    List<Destination> findByAgency (String Agency);
}
