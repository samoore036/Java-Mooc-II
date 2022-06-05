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
import java.util.Iterator;
import java.util.List;
public class Employees {
    private ArrayList<Person> employeeList = new ArrayList<>();
    
    public void add(Person personToAdd) {
        this.employeeList.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(person -> this.employeeList.add(person));
    }
    
    public void print() {
        this.employeeList.forEach(person -> System.out.println(person));
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employeeList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                System.out.println(iterator.next());
            }
        }  
//        this.employeeList.stream()
//                .filter(p -> p.getEducation() == education)
//                .forEach(p -> System.out.println(p));
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.employeeList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
