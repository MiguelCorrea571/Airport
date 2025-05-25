/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package airport.model;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface FlightRegistry {
    void addFlight(Flight flight);
    int countFlights();
    ArrayList<Flight> getFlights();
}
