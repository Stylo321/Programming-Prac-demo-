/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author silol
 */
import java.util.Scanner;

// ===== Interface =====
interface IRoadAccidents {
    String getAccidentVehicleType();
    String getCity();
    int getAccidentTotal();
}

// ===== Abstract Class =====
abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    public String getAccidentVehicleType() { return vehicleType; }
    public String getCity() { return city; }
    public int getAccidentTotal() { return accidentTotal; }
}

// ===== Subclass =====
class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    public void printAccidentReport() {
        System.out.println("Vehicle: " + getAccidentVehicleType() +
                           " | City: " + getCity() +
                           " | Accidents: " + getAccidentTotal());
    }
}

// ===== Main Application =====
public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accident records: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        RoadAccidentReport[] records = new RoadAccidentReport[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nRecord " + (i + 1));

            System.out.print("Enter vehicle type (Car/Motorbike): ");
            String vehicle = sc.nextLine();

            System.out.print("Enter city: ");
            String city = sc.nextLine();

            System.out.print("Enter number of accidents: ");
            int total = sc.nextInt();
            sc.nextLine(); // consume newline

            records[i] = new RoadAccidentReport(vehicle, city, total);
        }

        System.out.println("\n=== Vehicle Accident Report ===");
        System.out.println("=================================");
        for (RoadAccidentReport r : records) {
            r.printAccidentReport();
        }
        System.out.println("=================================");

        sc.close();
    }
}