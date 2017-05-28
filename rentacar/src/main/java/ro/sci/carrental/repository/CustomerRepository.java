package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Customer;

import java.util.List;

/**
 * Repository interface for customer, this will help managing all persistence operations.
 *
 * @author Vintila Andrei
 */
public interface CustomerRepository {

    /**
     * Gets all the customers in the system.
     * @return
     */
    List<Customer> getAll();

    /**
     * Return all the customers of a certain last name
     * @param lastName
     * @return List<Customer>
     */
    List<Customer> getCustomerbyLastName(String lastName);

    /**
     * Get customers by telephone
     * @param telephone
     * @return List<Car>
     */
    List<Customer> getCustomerByTelephone(String telephone);

    /**
     * Adds a customer in the system
     * @param customer
     */
    void add(Customer customer);

    /**
     * Bans a customers in the system
     * @param customer
     */
    void ban (Customer customer);

    /**
     * Updates a customer in the system
     * @param customer
     */
    void update(Customer customer);
}
