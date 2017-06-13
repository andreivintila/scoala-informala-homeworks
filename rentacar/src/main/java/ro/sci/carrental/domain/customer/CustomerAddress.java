package ro.sci.carrental.domain.customer;

/**
 * @author Vintila Andrei
 */
public class CustomerAddress {
    private String country;
    private String city;
    private String streetAddress;

    public CustomerAddress() {
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
