/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model.storage;

import airport.model.Passenger;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class PassengersStorage {

    private static PassengersStorage instance;

    // Atributos del Storage
    private ArrayList<Passenger> passengers;

    private PassengersStorage() {
        this.passengers = new ArrayList<>();
    }

    public static PassengersStorage getInstance() {
        if (instance == null) {
            instance = new PassengersStorage();
        }
        return instance;
    }

    public boolean addPassenger(Passenger passenger) {
        if (this.passengers.size() != 0) {
            for (Passenger p : this.passengers) {
                if (p.getId() == passenger.getId()) {
                    return false;
                }
            }
        }
        this.passengers.add(passenger);
        return true;
    }

    public Passenger getPassenger(long id) {
        for (Passenger passenger : this.passengers) {
            if (passenger.getId() == id) {
                return passenger;
            }
        }
        return null;
    }

    public boolean delPassenger(long id) {
        for (Passenger passenger : this.passengers) {
            if (passenger.getId() == id) {
                this.passengers.remove(passenger);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }
}
