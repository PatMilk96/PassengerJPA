package ie.atu.PassengerJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerJpaApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers(){
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26),
				new Passenger("Mr", "David", "12345674534", "0857549583", 23),
				new Passenger("Mr", "Mike", "1234575466", "0853643483", 60));
		return myPassengers;
	}
}
