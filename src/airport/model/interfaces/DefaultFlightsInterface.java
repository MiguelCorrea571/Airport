/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package airport.model.interfaces;

import airport.model.Flight;

/**
 *
 * @author pc
 */
public interface DefaultFlightsInterface {
    public boolean addFlight(Flight flight);
    public Flight getFlight(String id);
    public boolean delFlight(String id);
}
