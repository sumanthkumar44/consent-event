package Customer.consentevent.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CASConsentModel {
    private String casId;
    private String consentId;
    private final String consentType= "CAS";
    private String cin;

}
