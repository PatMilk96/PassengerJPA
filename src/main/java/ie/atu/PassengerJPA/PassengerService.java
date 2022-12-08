package ie.atu.PassengerJPA;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String passengerID){
        return new Passenger("Mr", "Paddy", "2188726374", "0898872736", 70);
    }

    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }
}
