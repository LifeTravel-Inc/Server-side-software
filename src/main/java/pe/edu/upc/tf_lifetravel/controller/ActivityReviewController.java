package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_lifetravel.entities.ActivityReview;
import pe.edu.upc.tf_lifetravel.entities.Agency;
import pe.edu.upc.tf_lifetravel.repository.ActivityRepository;
import pe.edu.upc.tf_lifetravel.repository.ActivityReviewRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ActivityReviewController {

    @Autowired
    private ActivityReviewRepository activityReviewRepository;

    @GetMapping("/activityreviews")
    public ResponseEntity<List<ActivityReview>> getAllActivityReviews(){
        List<ActivityReview> activitiereviews = activityReviewRepository.findAll();
        return new ResponseEntity<List<ActivityReview>> (activitiereviews, HttpStatus.OK);
    }

    @PostMapping("/activityreviews")
    public ResponseEntity<ActivityReview> createActivityReview( @RequestBody ActivityReview activityReview){
        ActivityReview newActivityReview = activityReviewRepository.save(
                new ActivityReview(activityReview.getUser(), activityReview.getDate(), activityReview.getActivity())
        );
        return new ResponseEntity<ActivityReview>(newActivityReview, HttpStatus.CREATED);
    }
}
