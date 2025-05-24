/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model;

/**
 *
 * @author Yoinner G
 */
public class PassengerManager {

    private Flight flight;
    private Passenger passenger;

    public PassengerManager(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public void addFlight(Flight flight) {
        passenger.getFlights().add(flight);
    }

    public void addPassenger(Passenger passenger) {
        flight.getPassengers().add(passenger);
    }
}
