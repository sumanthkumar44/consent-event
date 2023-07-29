package Customer.consentevent.service;

import Customer.consentevent.Model.EventModel;
import Customer.consentevent.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class EventService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    EventRepository eventRepository;
    private final String callBackUrl= "http://localhost:9090/event";

    public ResponseEntity<HttpStatus> postEvent(EventModel eventModel)
    {
        EventModel response = eventRepository.save(eventModel);
        log.info("Event is published with eventID: "+response.getEventId());
        return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }
}
