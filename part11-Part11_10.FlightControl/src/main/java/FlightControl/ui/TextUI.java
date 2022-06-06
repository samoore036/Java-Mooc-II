/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;
import java.util.Scanner;
import FlightControl.logic.FlightControl;

/**
 *
 * @author mooshahe
 */
public class TextUI {
    private Scanner scanner;
    private FlightControl control;
    
    public TextUI(Scanner scanner, FlightControl control) {
        this.scanner = scanner;
        this.control = control;
    }
    
    public void start() {
        this.startAssetControl();
    }
    
    public void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight"); 
            System.out.println("[x] Exit Airport Asset Control");
            System.out.println(">");
            String command = this.scanner.nextLine();
            if (command.equals("1")) {
                this.addAirplane();
                continue;
            }
            if (command.equals("2")) {
                this.addFlight();
                continue;
            }
            if (command.equalsIgnoreCase("x")) {
                break;
            }
        }
        this.startFlightControl();
    }
    
    public void addAirplane() {
        System.out.println("Give the airplane id:");
        String id = this.scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = Integer.valueOf(this.scanner.nextLine());
        this.control.addAirplane(id, capacity);
    }
    
    public void addFlight() {
        System.out.println("Give the airplane id:");
        String id = this.scanner.nextLine();
        System.out.println("Give the departure airport id:");
        String departure = this.scanner.nextLine();
        System.out.println("Give the target airport id:");
        String target = this.scanner.nextLine();
        this.control.addFlight(id, departure, target);
    }
    
    public void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes"); 
            System.out.println("[2] Print flights"); 
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.println(">");
            String command = this.scanner.nextLine();
            if (command.equals("1")) {
                this.control.printAirplanes();
                continue;
            }
            if (command.equals("2")) {
                this.control.printFlights();
            }
            if (command.equals("3")) {
                System.out.println("Give the airplane id:");
                String id = this.scanner.nextLine();
                this.control.printAirplaneDetails(id);
                continue;
            }
            if (command.equalsIgnoreCase("x")) {
                break;
            }
        }
    }
}
