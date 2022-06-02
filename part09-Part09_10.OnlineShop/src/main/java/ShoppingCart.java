/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingCart {
    private Map<String,Item> cart = new HashMap<>();
    
    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product,1,price));
        }
    }
    
    public int price() {
        int sum = 0;
        for (Item i : this.cart.values()) {
            sum += i.price();
        }
        return sum;         
    }
    
    public void print() {
        Iterator<Item> iterator = this.cart.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
