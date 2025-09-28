package Question2;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many records the user wants to enter
        System.out.print("Enter number of accident records: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create array to hold accident records
        RoadAccidentReport1[] records = new RoadAccidentReport1[n];

        // Input loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nRecord " + (i + 1));

            System.out.print("Enter vehicle type (Car/Motorbike): ");
            String vehicle = sc.nextLine();

            System.out.print("Enter city: ");
            String city = sc.nextLine();

            System.out.print("Enter number of accidents: ");
            int total = sc.nextInt();
            sc.nextLine(); // consume newline

            // Store record in array
            records[i] = new RoadAccidentReport1(vehicle, city, total);
        }

        // Print all accident reports
        System.out.println("\n=== Vehicle Accident Report ===");
        System.out.println("\n=================================================");
        for (RoadAccidentReport1 r : records) {
            r.printAccidentReport();
        }
        System.out.println("\n=================================================");

        sc.close();
    }
}
