package Customer.consentevent.controller;

import Customer.consentevent.Model.ConsentModel;
import Customer.consentevent.service.ConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consent")
public class ConsentController {
    @Autowired
    private ConsentService consentService;
    @PostMapping
    public ResponseEntity<ConsentModel> createConsent(@RequestBody ConsentModel consentModel)
    {
        ConsentModel response = consentService.createConsent(consentModel);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
    @GetMapping("/{consentId}")
    public ResponseEntity getConsent(@PathVariable String consentId)
    {
        ConsentModel responseBody= consentService.getConsent(consentId);
        return new ResponseEntity(responseBody, HttpStatus.OK);

    }

}
