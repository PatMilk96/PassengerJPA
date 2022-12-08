package ie.atu.PassengerJPA;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;

    public PassengerService(PassengerRepo passengerRepo) {
        this.passengerRepo = passengerRepo;
    }

    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Paddy", "2188726374", "0898872736", 70);
        return myPassenger;
    }
}
