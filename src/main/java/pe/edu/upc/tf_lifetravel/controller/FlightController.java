package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_lifetravel.entities.Agency;
import pe.edu.upc.tf_lifetravel.entities.Flight;
import pe.edu.upc.tf_lifetravel.repository.AgencyRepository;
import pe.edu.upc.tf_lifetravel.repository.FlightRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> getAllAgencies(){
        List<Flight> flights = flightRepository.findAll();
        return new ResponseEntity<List<Flight>> (flights, HttpStatus.OK);
    }


}
