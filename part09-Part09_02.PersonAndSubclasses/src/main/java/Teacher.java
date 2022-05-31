/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name,address);
        this.salary = salary;
    }
    
    public int salary() {
        return this.salary;
    }
    
    @Override
    public String toString() {
        return String.format(super.toString() + "\n  salary %s euro/month",this.salary);
    }
}
