/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
public class Book {
    private final String title;
    private final int age;
    
    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAge() {
        return this.age;
    }
      
    public String toString() {
        return String.format("%s (recommended for %s year-olds or older)", this.title,this.age); 
    }
}
