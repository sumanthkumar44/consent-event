package Customer.consentevent.controller;


import Customer.consentevent.Model.AddressModel;
import Customer.consentevent.service.CDNAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cas")
public class CDNAController {
    @Autowired
    private CDNAService cdnaService;

    @GetMapping("/{cin}")
    public ResponseEntity getAddress(@PathVariable String cin)
    {
        return new ResponseEntity(new AddressModel(), HttpStatus.OK);
    }
}
