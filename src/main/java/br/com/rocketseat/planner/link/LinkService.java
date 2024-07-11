package br.com.rocketseat.planner.link;

import br.com.rocketseat.planner.activity.ActivityData;
import br.com.rocketseat.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayLoad payLoad, Trip trip){
       Link newLink = new Link(payLoad.title(), payLoad.url(), trip );

        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());

    }

    public List<ActivityData> getAllActivitiesFromId(UUID tripId) {
        return new ArrayList<>();
    }
}
