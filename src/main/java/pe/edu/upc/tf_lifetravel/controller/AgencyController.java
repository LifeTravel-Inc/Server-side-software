package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_lifetravel.entities.Agency;
import pe.edu.upc.tf_lifetravel.repository.AgencyRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AgencyController {

    @Autowired
    private AgencyRepository agencyRepository;

    @GetMapping("/agencies")
    public ResponseEntity<List<Agency>> getAllAgencies(){
        List<Agency> agencies = agencyRepository.findAll();
        return new ResponseEntity<List<Agency>> (agencies,HttpStatus.OK);
    }

    @PostMapping("/agencies")
    public ResponseEntity<Agency> createAgency( @RequestBody Agency agency){
        Agency newAgency = agencyRepository.save(
                new Agency(agency.getName(), agency.getEmail(), agency.getPhone(), agency.getPassword())
        );
        return new ResponseEntity<Agency>(newAgency, HttpStatus.CREATED);
    }
}
