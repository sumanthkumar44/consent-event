package Customer.consentevent.service;

import Customer.consentevent.Model.ConsentModel;
import Customer.consentevent.repository.ConsentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsentService {
    @Autowired
    ConsentRepository consentRepository;
    public ConsentModel createConsent(ConsentModel consentModel)
    {
        return consentRepository.save(consentModel);
    }
    public List<ConsentModel> getAllConsents()
    {
        return consentRepository.findAll();
    }
    public ConsentModel getConsent(String consentId)
    {
        return consentRepository.getConsentModelByConsentId(consentId);
    }
    public List<ConsentModel> getConsentModelByCin(String cin)
    {
        return consentRepository.getConsentModelByCin(cin);
    }
}
