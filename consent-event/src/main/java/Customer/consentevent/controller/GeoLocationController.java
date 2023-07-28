package Customer.consentevent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geolocation")
public class GeoLocationController {
    @GetMapping
    public String getGeoLocation(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude)
    {
        return "EC2M 4AA";

    }
}
