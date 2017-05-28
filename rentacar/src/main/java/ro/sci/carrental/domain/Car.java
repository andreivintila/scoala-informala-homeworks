package ro.sci.carrental.domain;

import ro.sci.carrental.util.FuelType;
import ro.sci.carrental.util.VehicleCategory;

/**
 * Car Class initialization
 *
 * @author Vintila Andrei
 */
public class Car { 

    private String make;
    private String model;
    private VehicleCategory category;
    private FuelType fueltype;
    private String color;
    private int gearbox;
    private int noofdoors;
    private int noofseats;
    private boolean availability;


    public Car(String make, String model, VehicleCategory category, FuelType fueltype, String color,  int gearbox, int noofdors, int noofseats, boolean availability) {
        this.make = make;
        this.model = model;
        this.category = category;
        this.fueltype = fueltype;
        this.color = color;
        this.gearbox = gearbox;
        this.noofdoors = noofdors;
        this.noofseats = noofseats;
        this.availability = availability;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }

    public FuelType getFueltype() {
        return fueltype;
    }

    public void setFueltype(FuelType fueltype) {
        this.fueltype = fueltype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGearbox() {
        return gearbox;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    public int getNoofdoors() {
        return noofdoors;
    }

    public void setNoofdoors(int noofdoors) {
        this.noofdoors = noofdoors;
    }

    public int getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(int noofseats) {
        this.noofseats = noofseats;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
