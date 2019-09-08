//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private String flightNumber;
    private String destination;
    private String departureApt;
    private String departureTime;


    public Flight(String flightNumber, PlaneType plane, String destination, String departureApt, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureApt = departureApt;
        this.departureTime = departureTime;


    }


    public String getFlightNo() {
        return this.flightNumber;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getDepartureApt() {
        return this.departureApt;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getPassengersSize() {
        return this.passengers.size();
    }

    public boolean roomOnFlight() {
        return plane.getCapacity() >= passengers.size();
    }

    public void addPassenger(Passenger passenger1) {
       if (roomOnFlight()) {
           this.passengers.add(passenger1);
       }
       }

    public int getAvailableSeats() {
          return plane.getCapacity() - passengers.size();
    }


    public double getPlaneCapacity() {
        return plane.getCapacity();
    }

    public double getPlaneWeight() {
        return  plane.getWeight();
    }

    public double getAvailableLuggageWeight() {
        return getPlaneWeight() / 2;
    }

    public int getNoOfPassengersBags(Passenger passenger) {
        return passenger.getBags();
    }
}
