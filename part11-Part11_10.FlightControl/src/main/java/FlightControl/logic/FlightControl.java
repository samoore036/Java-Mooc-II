/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author mooshahe
 */
public class FlightControl {
    ArrayList<Airplane> planes;
    ArrayList<Flight> flightControl;
    
    public FlightControl() {
        this.planes = new ArrayList<>();
        this.flightControl = new ArrayList<>();
    }
    
    public void addAirplane(String id, int capacity) {
        this.planes.add(new Airplane(id,capacity));
    }
    
    public void addFlight(String id, String departure, String target) {
        int count = 0;
        for (Airplane p : this.planes) {
            if (p.getID().equalsIgnoreCase(id)) {
                count++;
            }
            if (count > 0) {
                this.flightControl.add(new Flight(p,new Place(departure),new Place(target)));
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Flight could not be created because airplane %s is not in the database.",id));               
    }
    
    public void printAirplanes() {
        this.planes.stream().forEach(plane -> System.out.println(plane));
    }
    
    public void printFlights() {
        Iterator<Flight> iterator = this.flightControl.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void printAirplaneDetails(String id) {
        this.planes.stream()
                .filter(airplane -> airplane.getID().equalsIgnoreCase(id))
                .forEach(airplane -> System.out.println(airplane));
    }
    
}
