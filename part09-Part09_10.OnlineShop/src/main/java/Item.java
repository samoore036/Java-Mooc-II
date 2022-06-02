/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class Item {
    private final String product;
    private int qty;
    private final int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.unitPrice*this.qty;
    }
    
    public void increaseQuantity() {
        this.qty += 1;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s",this.product, this.qty);
    }
}
