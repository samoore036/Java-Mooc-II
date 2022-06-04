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
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Input first name:");
            String firstName = scanner.nextLine();
            System.out.println("Input last name:");
            String lastName = scanner.nextLine();
            System.out.println("Input the year of birth:");
            int year = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            persons.add(new Person(firstName,lastName,year));
            
        }

        // Implement the printing of the unique last names in alphabetical order here:
        System.out.println("");
        System.out.println("Unique last names in alphabetical order:");
        persons.stream()
                .map(p -> p.getLastName())
                .distinct()
                .forEach(p -> System.out.println(p));
    
    }
}
