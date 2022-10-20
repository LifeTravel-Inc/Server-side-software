package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.tf_lifetravel.entities.Agency;
import pe.edu.upc.tf_lifetravel.entities.Destination;
import pe.edu.upc.tf_lifetravel.repository.AgencyRepository;
import pe.edu.upc.tf_lifetravel.repository.DestinationRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DestinationController {
    @Autowired
    private DestinationRepository destinationRepository;

    @GetMapping("/destinations")
    public ResponseEntity<List<Destination>> getAllDestinations(){
        List<Destination> destinations = destinationRepository.findAll();
        return new ResponseEntity<List<Destination>> (destinations, HttpStatus.OK);
    }
}
