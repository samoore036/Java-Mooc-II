/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName,capacity);
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return amount;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println(String.format("History: %s", this.history.toString()));
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
