/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model;

/**
 *
 * @author pc
 */
public class PlaneFlightsManager {
    public int getNumFlights(Plane plane) {
        return plane.getFlights().size();
    }
    public void addFlight(Plane plane,Flight flight) {
        plane.getFlights().add(flight);
    }
}
