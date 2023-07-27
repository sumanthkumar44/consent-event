package Customer.consentevent.repository;

import Customer.consentevent.Model.ConsentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConsentRepository extends JpaRepository<ConsentModel,String> {
     ConsentModel save(ConsentModel consentModel);
     ConsentModel getConsentModelByConsentId(String consentId);
     List<ConsentModel> getConsentModelByCin(String cin);
     List<ConsentModel> findAll();


}
