
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        int count = 0;
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        if (answer.matches("n|ne|neg|negative")) {
            double avgNeg = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(neg -> neg < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + avgNeg);
        } else if (answer.matches("p||po||pos||positive")) {
            double avgPos = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(pos -> pos > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + avgPos);
        }
    } 
}
