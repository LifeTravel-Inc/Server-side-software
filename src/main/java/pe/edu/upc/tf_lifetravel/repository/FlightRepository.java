package pe.edu.upc.tf_lifetravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tf_lifetravel.entities.Destination;
import pe.edu.upc.tf_lifetravel.entities.Flight;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
