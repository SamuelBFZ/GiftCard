package com.samuel.giftcard_activites.Activiy;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    @GetMapping
    public List<Activity> getAllActivities(){
        return activityService.getAllActivities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activity> getActicityById(@PathVariable Integer id){
        Activity activity = activityService.findActivityById(id);
            if (activity == null) {
                return ResponseEntity.notFound().build();
            }
        return ResponseEntity.ok(activity);    
    }

    @PostMapping
    public void createActivity(@RequestBody Activity activity){
        activityService.createActivity(activity);
    }

    @DeleteMapping("/{id}")
    public void deleteActivityById(@PathVariable Integer id){
        activityService.deleteActivityById(id);
    }

}
