package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * implementation of interface CustomerRepository
 *
 * Created by ADMIN on 28-May-17.
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private List<Customer> customers = new ArrayList<Customer>();

    public List<Customer> getAll() {
        return customers;
    }

    public List<Customer> getCustomerbyLastName(String lastName) {
        return null;
    }

    public List<Customer> getCustomersbyFirstName(String firstName) {
        return null;
    }

    public List<Customer> getCustomerByTelephone(String telephone) {
        return null;
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void ban(Customer customer) {
    }

    public void update(Customer customer) {
    }
}
