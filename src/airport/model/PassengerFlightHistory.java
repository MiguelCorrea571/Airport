package airport.model;

public class PassengerFlightHistory {        
    public void addFlight(Passenger passenger,Flight flight) {
        passenger.getFlights().add(flight);
    }

    public int getFlightCount(Passenger passenger) {
        return passenger.getFlights().size();
    }

    
}
