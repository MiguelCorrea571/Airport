/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package airport.model.interfaces;

import airport.model.Location;
import airport.model.Passenger;
import airport.model.Plane;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author pc
 */
public interface FlightInterface {
    String getId();
    Plane getPlane();
    void setPlane(Plane plane);
    Location getDepartureLocation();
    void setDepartureLocation(Location location);
    Location getArrivalLocation();
    void setArrivalLocation(Location location);
    Location getScaleLocation();
    void setScaleLocation(Location location);
    LocalDateTime getDepartureDate();
    void setDepartureDate(LocalDateTime departureDate);
    LocalDateTime calculateArrivalDate();
    void delay(int hours, int minutes);
    List<Passenger> getPassengers();        
}
