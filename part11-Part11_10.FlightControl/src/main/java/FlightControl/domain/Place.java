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
public class Place {
    private String name;
    
    public Place(String name) {
        if (name.length() !=3) {
            throw new IllegalArgumentException("Type in the correct airpot code. Airport codes are three symbols.");
        }
        this.name = name.toUpperCase();
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
