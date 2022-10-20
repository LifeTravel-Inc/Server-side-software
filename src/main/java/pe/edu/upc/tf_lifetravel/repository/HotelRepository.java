package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.Hotel;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
