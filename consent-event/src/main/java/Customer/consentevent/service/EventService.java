package Customer.consentevent.service;

import Customer.consentevent.Model.EventModel;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final String callBackUrl= "http://localhost:9090/event";

    public void postEvent(EventModel eventModel)
    {
        //need rest template call
    }
}
