
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            String age = scanner.nextLine();
            System.out.println("");
            books.add(new Book(bookName,Integer.valueOf(age)));
        }
        
        System.out.println("");
        System.out.println(String.format("%s books in total.",books.size()));
        System.out.println("" + "\n" + "Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge).thenComparing(Book::getTitle);
        Collections.sort(books,comparator);
        books.forEach(book -> System.out.println(book));
    }

}
