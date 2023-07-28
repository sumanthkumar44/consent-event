package Customer.consentevent.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsentDto {
    private String consentId;
    private String payload;
    private String createdAt;
    private final String consentType= "CAS";
    private String cin;
}
