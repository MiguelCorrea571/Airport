/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package airport.model.interfaces;

import airport.model.Plane;

/**
 *
 * @author pc
 */
public interface DefaultPlaneInterface {
    public boolean addPlane(Plane plane);
    public Plane getPlane(String id);
    public boolean delPlane(String id);
}
