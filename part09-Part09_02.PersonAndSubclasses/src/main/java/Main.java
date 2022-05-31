import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada","24 Maddox",1200));
        persons.add(new Student("Ollie","6381 Hollywood"));
        
        printPersons(persons);
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        persons.stream().forEach(p -> System.out.println(p));
    }
}
