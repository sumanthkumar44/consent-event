package Customer.consentevent.controller;

import Customer.consentevent.Model.ConsentModel;
import Customer.consentevent.service.ConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consent")
public class ConsentController {
    @Autowired
    private ConsentService consentService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ConsentModel> createConsent(@RequestBody ConsentModel consentModel)
    {
        ConsentModel response = consentService.createConsent(consentModel);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
    @GetMapping(value = "/{consentId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getConsent(@PathVariable String consentId)
    {
        ConsentModel responseBody= consentService.getConsent(consentId);
        if(responseBody!=null)
        {
            return new ResponseEntity(responseBody, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }


    }

}
