import java.util.Scanner;

public class RoadAccidentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cities
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        
        // Vehicle types
        String[] vehicles = {"Car", "Motorbike"};
        
        // 2D array: rows = cities, columns = vehicle accidents
        int[][] accidents = new int[cities.length][vehicles.length];
        
        // Input accidents for each city
        System.out.println("=== Road Accident Data Capture ===");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < vehicles.length; j++) {
                System.out.print("Enter number of " + vehicles[j] + " accidents in " + cities[i] + ": ");
                accidents[i][j] = sc.nextInt();
            }
        }
        
// ...existing code...

        // Display Report
        System.out.println("\n=== Road Accident Report ==============================");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "City", "Cars", "Bikes", "Total");
        
        int maxAccidents = 0;
        String maxCity = "";
        int[] cityTotals = new int[cities.length]; // Array to store totals for each city

        for (int i = 0; i < cities.length; i++) {
            int total = accidents[i][0] + accidents[i][1];
            cityTotals[i] = total;
            System.out.printf("%-15s %-10d %-10d %-10d\n", cities[i], accidents[i][0], accidents[i][1], total);
            
            if (total > maxAccidents) {
                maxAccidents = total;
                maxCity = cities[i];
            }
        }

        // Display city with highest accidents
        System.out.println("\nCity with the highest number of road accidents: " 
                            + maxCity + " (" + maxAccidents + " accidents)");

        // Display totals table
        System.out.println("\n=== Total Accidents Per City ==============================");
        System.out.printf("%-15s %-10s\n", "City", "Total Accidents");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d\n", cities[i], cityTotals[i]);
        }

        sc.close();
    }
}
 