package Question2;
public class RoadAccidentReport1 extends RoadAccidents {
    // Constructor passes values to parent
    public RoadAccidentReport1(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Method to print report
    public void printAccidentReport() {
        System.out.println("Vehicle: " + getAccidentVehicleType() +
                           " | City: " + getCity() +
                           " | Accidents: " + getAccidentTotal());
    }
}
