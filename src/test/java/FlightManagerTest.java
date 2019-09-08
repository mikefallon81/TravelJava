import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightmanager;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void setup(){

        flight = new Flight("BA746", PlaneType.BOEING737, "EDIN", "GLA", "11:00");
        flightmanager = new FlightManager(flight);
        passenger1 = new Passenger("Mike", 1);
        passenger2 = new Passenger("John", 2);

    }

    @Test
    public void getAvailablePassengerLuggage(){
        assertEquals(1.0, flightmanager.getAvailablePassengerLuggageAllocation(), 0.01);
    }

    @Test
    public void calculateBaggageWeightForBookedCustomers(){
        flight.addPassenger(passenger2);
        assertEquals(2.00, flightmanager.calculatePassengerLuggageWeight(passenger2), 0.01);
    }

    @Test
    public void calculateRemainingWeightForLuggage(){
        flight.addPassenger(passenger2);
        assertEquals(3.00, flightmanager.calculateRemainingLuggageWeight(passenger2), 0.01);
    }


}
