package Customer.consentevent.service;

import Customer.consentevent.Model.EventModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EventService {
    @Autowired
    RestTemplate restTemplate;
    private final String callBackUrl= "http://localhost:9090/event";

    public void postEvent(EventModel eventModel)
    {
       ResponseEntity<String> response= restTemplate.postForEntity(callBackUrl,eventModel,String.class);

    }
}
