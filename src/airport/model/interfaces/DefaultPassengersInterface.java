/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package airport.model.interfaces;

import airport.model.Passenger;

/**
 *
 * @author pc
 */
public interface DefaultPassengersInterface {
    public boolean addPassenger(Passenger passenger);
    public Passenger getPassenger(long id);
    public boolean delPassenger(long id);
}
