package ro.sci.carrental.domain.car;

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
    private boolean isAvailable;
    private Price rentPrice;


    public Car() {
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

    public boolean isAvailable(boolean isAvailable) {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Price getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Price rentPrice) {
        this.rentPrice = rentPrice;
    }
}
