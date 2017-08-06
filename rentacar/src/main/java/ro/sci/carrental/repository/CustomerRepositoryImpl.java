package ro.sci.carrental.repository;

import ro.sci.carrental.domain.customer.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * implementation of interface CustomerRepository
 *
 * Created by ADMIN on 28-May-17.
 */
public class CustomerRepositoryImpl implements CustomerRepository<Customer> {

    private List<Customer> customers = new ArrayList<Customer>();

    public List<Customer> getAll() {
        return customers;
    }

    public List<Customer> getCustomerByLastName(String lastName) {
        return null;
    }

    public List<Customer> getCustomerByFullName(String firstName, String lastName) {
        return null;
    }

    public List<Customer> getCustomerByTelephone(String telephone) {
        return null;
    }


    public void add(Customer customer) {
        customers.add(customer);
    }

    public void addAll(List<Customer> customers) {
        customers.addAll(customers);
    }

    public void delete(Customer customer) {
        customers.removeIf(anotherCustomer -> anotherCustomer.equals(customer));
    }

    public void update(Customer customer) {
        customers.set(customers.indexOf(customer), customer);
    }
}
