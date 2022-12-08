package ie.atu.PassengerJPA;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers(){
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26),
                new Passenger("Mr", "David", "12345674534", "0857549583", 23),
                new Passenger("Mr", "Mike", "1234575466", "0853643483", 60));
        return myPassengers;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Paddy", "2188726374", "0898872736", 70);
        return myPassenger;
    }
}
