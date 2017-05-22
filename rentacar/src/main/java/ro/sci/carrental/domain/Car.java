package ro.sci.carrental.domain;

/**
 * Created by ADMIN on 18-May-17.
 */
public class Car {

    private String make;
    private String model;
    private String category;
    private String fueltype;
    private String color;
    private String gearbox;
    private Integer noofdors;
    private Integer noofseats;
    private String avalability;

    public Car(String make, String model, String category, String fueltype, String color,  String gearbox, Integer noofdors, Integer noofseats, String avalability) {
        this.make = make;
        this.model = model;
        this.category = category;
        this.fueltype = fueltype;
        this.color = color;
        this.gearbox = gearbox;
        this.noofdors = noofdors;
        this.noofseats = noofseats;
        this.avalability = avalability;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public String getFueltype() {
        return fueltype;
    }

    public String getColor() {
        return color;
    }

    public String getGearbox() {
        return gearbox;
    }

    public Integer getNoofdors() {
        return noofdors;
    }

    public Integer getNoofseats() {
        return noofseats;
    }

    public String getAvalability() {
        return avalability;
    }
}
