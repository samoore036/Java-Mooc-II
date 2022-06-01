/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double maxCapacity;
    
    public Box(double maxCapacity) {
        this.box = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable p) {
        if (this.weight() + p.weight() <= this.maxCapacity && this.maxCapacity > 0) {
            this.box.add(p);
            this.maxCapacity -= p.weight();
        }
    }
    
    @Override
    public double weight() {
        double weight = this.box.stream()
                .mapToDouble(p -> p.weight())
                .sum();
        return weight;
    }
    
    @Override
    public String toString() {
        return String.format("Box: %s items, total weight %s kg",this.box.size(),this.weight());
    }
    
}
