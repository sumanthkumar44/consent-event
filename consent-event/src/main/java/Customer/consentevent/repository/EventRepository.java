package Customer.consentevent.repository;

import Customer.consentevent.Model.EventModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<EventModel, String> {
    EventModel save(EventModel eventModel);
}
