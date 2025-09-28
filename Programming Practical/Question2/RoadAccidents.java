package Question2;
public abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    // Constructor
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Getters (implementing interface methods)
    public String getAccidentVehicleType() { return vehicleType; }
    public String getCity() { return city; }
    public int getAccidentTotal() { return accidentTotal; }
}
