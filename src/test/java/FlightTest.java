import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void setup() {
        flight = new Flight("BA75", PlaneType.BOEING737, "EDIN", "GLA", "11:00");
        passenger1 = new Passenger("Michael", 2);
        passenger2 = new Passenger("Paul", 3);
        passenger3 = new Passenger("Will", 5);
        passenger4 = new Passenger("Peter", 1);
        passenger5 = new Passenger("Noel", 0);
    }

    @Test
    public void flightHasNumberBA75(){
        assertEquals("BA75", flight.getFlightNo());
    }

    @Test
    public void  flightHasDestinationEdin(){
        assertEquals("EDIN", flight.getFlightDestination());
    }

    @Test
    public void flightHasDepartureGlas(){
        assertEquals("GLA", flight.getDepartureApt());
    }

    @Test
    public void flightHasDepartureTime1100(){
        assertEquals("11:00", flight.getDepartureTime());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(5.00, flight.getPlaneCapacity(), 0.01);
    }

    @Test
    public void getPlaneWeight(){
        assertEquals(10.00, flight.getPlaneWeight(), 0.01);
    }

    @Test
    public void getWeightAvailableForPassengerLuggage(){
        assertEquals(5.00, flight.getAvailableLuggageWeight(), 0.01);
    }

    @Test
    public void passengerNumbers(){
        assertEquals(0, flight.getPassengersSize());
    }

    @Test
    public void addPassengerToFlightTrue(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengersSize());
    }

    @Test
    public void checkIfRoomOnFlightTrue(){
        assertEquals(true, flight.roomOnFlight());
    }

    @Test
    public void checkIfRoomOnFlightFalse(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger5);
        assertEquals(false, flight.roomOnFlight());
    }

    @Test
    public void checkAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(3, flight.getAvailableSeats());
    }

    @Test
    public void getNoOfPassengersBags(){
        assertEquals(2, flight.getNoOfPassengersBags(passenger1));
    }



}
