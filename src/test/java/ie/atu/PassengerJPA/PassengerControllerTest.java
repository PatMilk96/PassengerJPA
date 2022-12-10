package ie.atu.PassengerJPA;

import net.bytebuddy.ClassFileVersion;
import org.assertj.core.api.ComparableAssert;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;

import java.util.function.Predicate;

class PassengerControllerTest {

    @Autowired
    private PassengerRepo passengerRepo;

    @Test
    void getPassenger() {
        Passenger passenger = Passenger.builder()
                .title("Mr")
                .name("Patryk")
                .id("55366843546")
                .phone("0873326488")
                .age(20)
                .build();

        assertNotNull(passenger.getCount());
    }

    @Test
    void savePassenger() {
    }

    @Test
    void getPassengerName() {
    }

    @Test
    void deletePassenger() {
    }

    @Test
    void getPassengerByAge() {
    }
}