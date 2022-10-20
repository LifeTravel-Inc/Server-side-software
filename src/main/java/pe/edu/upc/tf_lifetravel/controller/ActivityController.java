package pe.edu.upc.tf_lifetravel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_lifetravel.entities.Activity;
import pe.edu.upc.tf_lifetravel.entities.Agency;
import pe.edu.upc.tf_lifetravel.repository.ActivityRepository;
import pe.edu.upc.tf_lifetravel.repository.AgencyRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ActivityController {
    @Autowired
    private ActivityRepository activityRepository;

    @GetMapping("/activities")
    public ResponseEntity<List<Activity>> getAllActivities(){
        List<Activity> activities = activityRepository.findAll();
        return new ResponseEntity<List<Activity>> (activities, HttpStatus.OK);
    }

    @PostMapping("/activities")
    public ResponseEntity<Activity> createActivitiy( @RequestBody Activity activity){
        Activity newActivity = activityRepository.save(
                new Activity(activity.getName(), activity.getDescription(),activity.getPrice(), activity.getDate(), activity.getDestination())
        );
        return new ResponseEntity<Activity>(newActivity, HttpStatus.CREATED);
    }
}
