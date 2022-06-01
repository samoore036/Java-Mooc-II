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

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> box;
    private int maxWeight;
    
    public BoxWithMaxWeight(int capacity) {
        this.box = new ArrayList<>();
        this.maxWeight = capacity;
    }
    
    public int weight() {
        return this.maxWeight;
    }
    
    
    @Override
    public void add(Item item) {
        if (this.maxWeight - item.getWeight() <= this.maxWeight && this.maxWeight - item.getWeight() >= 0) {
            this.box.add(item);
            this.maxWeight -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : this.box) {
            if (i.getName().equalsIgnoreCase(item.getName())) {
                return true;
            }
        }
        return false;
    }
    
    
}
