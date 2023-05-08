package factory1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter transport type (1 for ship, 2 for truck): ");
            try {
                int transportType1 = scanner.nextInt();
                Transport transport1 = TransportFactory.Create_Transport(transportType1);
                transport1.name();
                transport1.deliver();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a valid integer.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
