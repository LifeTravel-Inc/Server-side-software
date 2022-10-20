package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.tf_lifetravel.entities.Flight;
import pe.edu.upc.tf_lifetravel.entities.Hotel;
import pe.edu.upc.tf_lifetravel.repository.FlightRepository;
import pe.edu.upc.tf_lifetravel.repository.HotelRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotels = hotelRepository.findAll();
        return new ResponseEntity<List<Hotel>> (hotels, HttpStatus.OK);
    }
}
