package Customer.consentevent.repository;

import Customer.consentevent.Model.ConsentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConsentRepository extends MongoRepository<ConsentModel,String> {
     ConsentModel save(ConsentModel consentModel);
     ConsentModel getConsentModelByConsentId(String consentId);
     List<ConsentModel> getConsentModelByCin(String cin);
     List<ConsentModel> findAll();


}
