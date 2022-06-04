
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(rows -> rows.split(","))
                    .sorted((a,b) -> a[5].compareTo(b[5])) 
                    .filter(rows -> rows.length == 6)
                    .map(parts -> String.format("%s (%s), %s, %s", parts[3],parts[4],parts[2].split(" ")[1],parts[5]))
                    .forEach(country -> System.out.println(country));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
