package FlightControl;
import FlightControl.logic.FlightControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.ui.TextUI;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl fc = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        
        TextUI ui = new TextUI(scanner,fc);
        ui.start();
    }
}
