package com.samuel.giftcard_activites.Activiy;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepo; //Inyeccion de dependencias

    public List<Activity> getAllActivities(){
        return activityRepo.findAll();
    }

    public Activity findActivityById(Integer id){
        return activityRepo.findById(id).orElse(null);
    }

    public void createActivity(Activity activity){
        activityRepo.save(activity);
    }

    public void deleteActivityById(Integer id){
        activityRepo.deleteById(id);
    }
}
