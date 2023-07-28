package Customer.consentevent.repository;


import Customer.consentevent.Model.AddressModel;
import Customer.consentevent.Model.CASConsentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CDNARepository extends JpaRepository<AddressModel,String> {
CASConsentModel save(AddressModel consentModel);

}
