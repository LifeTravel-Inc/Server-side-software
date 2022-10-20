package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_lifetravel.entities.ActivityReview;
import pe.edu.upc.tf_lifetravel.entities.HotelReview;
import pe.edu.upc.tf_lifetravel.repository.ActivityReviewRepository;
import pe.edu.upc.tf_lifetravel.repository.HotelReviewRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelReviewController {

    @Autowired
    private HotelReviewRepository hotelReviewRepository;

    @GetMapping("/hotelreviews")
    public ResponseEntity<List<HotelReview>> getAllHotelReviews(){
        List<HotelReview> hotelreviews = hotelReviewRepository.findAll();
        return new ResponseEntity<List<HotelReview>> (hotelreviews, HttpStatus.OK);
    }

    @PostMapping("/hotelreviews")
    public ResponseEntity<HotelReview> createHotelReview( @RequestBody HotelReview hotelReview){
        HotelReview newHotelReview = hotelReviewRepository.save(
                new HotelReview(hotelReview.getUser(), hotelReview.getDate(), hotelReview.getHotel())
        );
        return new ResponseEntity<HotelReview>(newHotelReview, HttpStatus.CREATED);
    }
}
