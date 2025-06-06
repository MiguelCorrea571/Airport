/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model.storage;

import airport.model.Flight;
import airport.model.interfaces.DefaultFlightsInterface;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class FlightsStorage implements DefaultFlightsInterface {

    private static FlightsStorage instance;

    // Atributos del Storage
    private ArrayList<Flight> flights;

    private FlightsStorage() {
        this.flights = new ArrayList<>();
    }

    public static FlightsStorage getInstance() {
        if (instance == null) {
            instance = new FlightsStorage();
        }
        return instance;
    }

    @Override
    public boolean addFlight(Flight flight) {
        for (Flight f : this.flights) {
            if (f.getId().equals(flight.getId())) {
                return false;
            }
        }
        this.flights.add(flight);
        return true;
    }

    @Override
    public Flight getFlight(String id) {
        for (Flight flight : this.flights) {
            if (flight.getId().equals(id)) {
                return flight;
            }
        }
        return null;
    }

    @Override
    public boolean delFlight(String id) {
        for (Flight flight : this.flights) {
            if (flight.getId().equals(id)) {
                this.flights.remove(flight);
                return true;
            }
        }
        return false;
    }
}
