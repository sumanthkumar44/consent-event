package Customer.consentevent.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("event")
public class EventModel {

    @Id
    private String eventId;
    private Object payload;
    private String eventType;

}
