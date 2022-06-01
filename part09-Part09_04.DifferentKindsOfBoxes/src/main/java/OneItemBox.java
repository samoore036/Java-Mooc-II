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

public class OneItemBox extends Box{
    private ArrayList<Item> box;
    private int weight;
    
    public OneItemBox() {
        this.box = new ArrayList<>();
        this.weight = 0;
    }
    
    @Override
    public void add(Item item) {
        if (this.box.isEmpty()) {
            this.box.add(item);
            this.weight = item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.box.isEmpty()) {
            return false;
        }
        if (this.box.get(0).getName().equalsIgnoreCase(item.getName())) {
            return true;
        }
        return false;
    }
    
}
