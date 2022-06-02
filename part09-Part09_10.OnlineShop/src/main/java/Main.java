import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
        // Test your app here
        Scanner scanner = new Scanner(System.in);
        Warehouse wh = new Warehouse();
        wh.addProduct("coffee", 5, 10);
        wh.addProduct("milk", 3, 4);
        wh.addProduct("cream", 2, 3);
        wh.addProduct("bread", 1, 2);
        
        Store store = new Store(wh,scanner);
        store.shop("Shaw");
        
        System.out.println("Coffee: " + (wh.stock("coffee")));
        System.out.println("Milk: " + wh.stock("milk"));
        System.out.println("Bread: " + wh.stock("bread"));
    }
}
