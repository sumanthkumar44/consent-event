package Customer.consentevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsentEventApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ConsentEventApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate()
	{
	return  new RestTemplate();
	}

}
