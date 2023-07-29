package Customer.consentevent.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("ConsentModel")
public class ConsentModel {
    @Id
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String consentId;
    private List<String> payload;
    private String createdAt;
    private String consentType;
    private String cin;
}
