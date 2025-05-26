/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.model.storage;

import airport.model.Plane;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class PlanesStorage {

    private static PlanesStorage instance;

    // Atributos del Storage
    private ArrayList<Plane> planes;

    private PlanesStorage() {
        this.planes = new ArrayList<>();
    }

    public static PlanesStorage getInstance() {
        if (instance == null) {
            instance = new PlanesStorage();
        }
        return instance;
    }

    public boolean addPlane(Plane plane) {
        for (Plane p : this.planes) {
            if (p.getId().equals(plane.getId())) {
                return false;
            }
        }
        this.planes.add(plane);
        return true;
    }

    public Plane getPlane(String id) {
        for (Plane plane : this.planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public boolean delPlane(String id) {
        for (Plane plane : this.planes) {
            if (plane.getId().equals(id)) {
                this.planes.remove(plane);
                return true;
            }
        }
        return false;
    }
}
