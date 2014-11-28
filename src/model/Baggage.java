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

    public Baggage() {
        this("", "", "", "", "", "", "", "");
    }

    public Baggage(String baggageId, String collor, String weight, String brand, String description, String materials, String department, String status) {
        this.baggageId = baggageId;
        this.collor = collor;
        this.weight = weight;
        this.brand = brand;
        this.description = description;
        this.materials = materials;
        this.department = department;
        this.status = status;

    }

}
