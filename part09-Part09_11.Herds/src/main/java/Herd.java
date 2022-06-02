/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> herd = new ArrayList<>();

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : this.herd) {
            organism.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable organism : this.herd) {
            sb.append(organism + "\n");
        }
        return sb.toString();
    }
    
}
