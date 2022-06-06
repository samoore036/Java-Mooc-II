/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author mooshahe
 */
public class Flight {
    private Airplane plane;
    private Place departureId;
    private Place targetId;
    
    public Flight(Airplane plane, Place departure, Place target) {
        this.plane = plane;
        this.departureId = departure;
        this.targetId = target;
    }
    
    public Airplane getPlane() {
        return this.plane;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s passengers) (%s-%s)",this.plane.getID(), this.plane.getCapacity(), this.departureId, this.targetId);
    }
}
