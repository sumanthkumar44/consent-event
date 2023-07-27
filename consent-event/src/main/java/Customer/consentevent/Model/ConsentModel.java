package Customer.consentevent.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ConsentModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String consentId;
    private String payload;
    private String createdAt;
    private String consentType;
    private String cin;
}
