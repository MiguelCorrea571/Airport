/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model.storage;

import airport.model.Location;
import airport.model.interfaces.DefaultLocationsInterface;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class LocationsStorage implements DefaultLocationsInterface{
private static LocationsStorage instance;

    // Atributos del Storage
    private ArrayList<Location> locations;

    private LocationsStorage() {
        this.locations = new ArrayList<>();
    }

    public static LocationsStorage getInstance() {
        if (instance == null) {
            instance = new LocationsStorage();
        }
        return instance;
    }
    @Override
    public boolean addLocation(Location location) {
        for (Location p : this.locations) {
            if (p.getAirportId().equals(location.getAirportId())) {
                return false;
            }
        }
        this.locations.add(location);
        return true;
    }
    @Override
    public Location getLocation(String id) {
        for (Location location : this.locations) {
            if (location.getAirportId().equals(id)) {
                return location;
            }
        }
        return null;
    }
    @Override
    public boolean delLocation(String id) {
        for (Location location : this.locations) {
            if (location.getAirportId().equals(id)) {
                this.locations.remove(location);
                return true;
            }
        }
        return false;
    }    

    public ArrayList<Location> getLocations() {
        return locations;
    }
    
}
