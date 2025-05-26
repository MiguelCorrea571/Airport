/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package airport.model.interfaces;

import airport.model.Location;

/**
 *
 * @author pc
 */
public interface DefaultLocationsInterface {
    public boolean addLocation(Location location);
    public Location getLocation(String id);
    public boolean delLocation(String id);
}
