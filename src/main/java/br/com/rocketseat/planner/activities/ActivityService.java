package br.com.rocketseat.planner.activities;

import br.com.rocketseat.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    public ActivityResponse registerActivity(ActivityRequestPayLoad payLoad, Trip trip){
        Activity newActivity = new Activity(payLoad.title(), payLoad.occurs_at(), trip );

        this.repository.save(newActivity);

        return  new ActivityResponse(newActivity.getId());

    }
}
