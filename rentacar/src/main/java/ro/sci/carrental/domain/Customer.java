package ro.sci.carrental.domain;

import ro.sci.carrental.util.CustomerAddress;
import ro.sci.carrental.util.PayMethod;

/**
 * Customes Class hold the first and the last name, the telephone, the address and the payment method of a customer
 *
 * @author Vintila Andrei
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String telephone;
    private CustomerAddress customerAddress;
    private PayMethod payMethod;

    /**
     * Constructor for Customer
     * @param firstName First Name
     * @param firstName Last Name
     * @param telephone Telephone Number
     * @param customerAddress Customer's Address
     * @param payMethod The Payment Method used
     */
    public Customer(String lastName, String firstName, String telephone, CustomerAddress customerAddress, PayMethod payMethod) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.telephone = telephone;
        this.customerAddress = customerAddress;
        this.payMethod = payMethod;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }
}
