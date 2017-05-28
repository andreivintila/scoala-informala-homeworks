package ro.sci.carrental.util;

/**
 * @author Vintila Andrei
 */
public class CustomerAddress {
    private String country;
    private String city;
    private String streetAddress;

    public CustomerAddress(String country, String city, String streetAddress) {
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
}
