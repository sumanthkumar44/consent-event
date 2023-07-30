package Customer.consentevent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geolocation")
public class GeoLocationController {
    @GetMapping
    public ResponseEntity<String> getGeoLocation(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude)
    {
        if(latitude.equalsIgnoreCase("latitude1")&&longitude.equalsIgnoreCase("longitude1")) {
            return new ResponseEntity<>("EC2M 4AA", HttpStatus.OK);
        }
        else if(latitude.equalsIgnoreCase("latitude1")&&longitude.equalsIgnoreCase("longitude1")) {
            return new ResponseEntity<>("EH2 4JN", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
