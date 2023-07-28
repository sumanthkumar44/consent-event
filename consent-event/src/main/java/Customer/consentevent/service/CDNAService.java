package Customer.consentevent.service;



import Customer.consentevent.repository.CDNARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class CDNAService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CDNARepository casRepository;
    private final URI CONSENT_BASE_URI= URI.create("http://localhost:8080/consent");


}
