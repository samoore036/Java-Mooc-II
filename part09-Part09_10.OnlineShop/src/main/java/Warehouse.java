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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Warehouse {
    private Map<String,Integer> warehouse = new HashMap<>();
    private Map<String,Integer> warehouseStock =  new HashMap<>();
    
    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.warehouseStock.put(product, stock);
    }
    
    public int stock(String product) {
        if (!this.warehouseStock.containsKey(product)) {
            return 0;
        } else {
            return this.warehouseStock.get(product);
        }
    }
    
    public int price(String product) {
        if (!this.warehouse.containsKey(product)) {
            return -99;
        } else {
            return this.warehouse.get(product);
        }
    }
    
    public boolean take(String product) {
        if (!warehouseStock.containsKey(product)) {
            System.out.println("product not found to take");
            return false;
        } else {
            int stock = this.warehouseStock.get(product);
            System.out.println("Current stock in warehouse is: " + stock);
            if (stock > 0) {
                stock -= 1;
                this.warehouseStock.put(product, stock);
                System.out.println("Current stock is now: " + this.warehouseStock.get(product));
                if (stock == 0) {
                    this.warehouseStock.remove(product);
                    this.warehouse.remove(product);
                }
                return true;
            } else {
                return false;
            }
        }
    }
    
    
    public Set<String> products() {
        Set<String> products = this.warehouse.entrySet().stream()
                .map(p -> p.getKey())
                .collect(Collectors.toSet());
        return products;
    }
    
    
}
