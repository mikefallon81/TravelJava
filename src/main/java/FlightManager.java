public class FlightManager {


    private Flight flight;

    public FlightManager(Flight flight){

    this.flight = flight;

    }

    public double getAvailablePassengerLuggageAllocation() {
        return this.flight.getAvailableLuggageWeight() / this.flight.getPlaneCapacity();
    }

    public double calculatePassengerLuggageWeight(Passenger passenger) {
        return this.getAvailablePassengerLuggageAllocation() * flight.getNoOfPassengersBags(passenger);
    }


    public double calculateRemainingLuggageWeight(Passenger passenger) {
        return flight.getAvailableLuggageWeight() - calculatePassengerLuggageWeight(passenger);
    }
}
