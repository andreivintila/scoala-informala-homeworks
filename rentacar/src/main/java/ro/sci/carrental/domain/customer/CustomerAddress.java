package ro.sci.carrental.domain.customer;

/**
 * @author Vintila Andrei
 */
public class CustomerAddress {
    private String country;
    private String city;
    private String streetAddress;

    public CustomerAddress(String city, String streetAddress) {
        this.city = city;
        this.streetAddress = streetAddress;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(city).append(",").append(streetAddress);
        return result.toString();
    }
}
