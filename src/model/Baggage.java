package model;

public class Baggage {

    public String baggageId;
    public String collor;
    public String weight;
    public String brand;
    public String description;
    public String materials;
    public String department;
    public String status;
    public String flightnr;

    public Baggage() {
        this("", "", "", "", "", "", "", "", "");
    }

    public Baggage(String baggageId, String department, String collor, String weight, String brand, String materials, String description, String status, String flightnr) {
        this.baggageId = baggageId;
        this.collor = collor;
        this.weight = weight;
        this.brand = brand;
        this.description = description;
        this.materials = materials;
        this.department = department;
        this.status = status;
        this.flightnr = flightnr;
    }

}
