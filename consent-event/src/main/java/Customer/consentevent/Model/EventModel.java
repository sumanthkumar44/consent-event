package Customer.consentevent.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventModel {
    private String eventId;
    private String payload;
}
