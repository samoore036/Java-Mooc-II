/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.util.Scanner;

public class Store {
    
    private Warehouse wh;
    private Scanner scanner;
    
    public Store(Warehouse wh, Scanner scanner) {
        this.wh = wh;
        this.scanner = scanner;
    }
    
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");
        
        for (String product : this.wh.products()) {
            System.out.println(product);
        }
        
        while (true) {
            System.out.println("What to put in the cart (press enter to go to the register):");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
            if (this.wh.take(product) == true) {
                cart.add(product, wh.price(product));
            }
            
        }
        
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
