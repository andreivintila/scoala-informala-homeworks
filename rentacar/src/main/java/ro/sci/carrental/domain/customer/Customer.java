package ro.sci.carrental.domain.customer;

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
     */

    public Customer() {
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
