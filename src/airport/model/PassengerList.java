/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author pc
 */
public class PassengerList {
    public void add(Flight flight,Passenger passenger) {
        flight.getPassengers().add(passenger);
    }

    public int count(Flight flight) {
        return flight.getPassengers().size();
    }    
}

