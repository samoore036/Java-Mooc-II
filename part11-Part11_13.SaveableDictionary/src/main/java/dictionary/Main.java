package dictionary;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.add("apina", "monkey");
        s.add("shaheen", "hawk");
        s.load();
        s.save();


        
        
        
        
    }
}
