package Customer.consentevent.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CASConsentModel {
    @Id
    private String casId;
    private String consentId;
    private final String consentType= "CAS";
    private String cin;

}
