import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before

    public void setup(){
        passenger = new Passenger("John", 1);
    }

    @Test
    public void getName(){
        assertEquals("John", passenger.getName());
    }

    @Test
    public void getBags(){
        assertEquals(1, passenger.getBags());
    }



}
