package ro.sci.carrental.simulation;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CustomerRepositoryImpl;

/**
 * Created by ADMIN on 04-Jul-17.
 */
public class CustomerSimulation {
    public void searches(CustomerRepositoryImpl customerRepository) {
        //cautarea tuturor clientilor
        System.out.println("Lista clientilor din sistem este: ");
        for (Customer customer : customerRepository.getAll()) {
            System.out.println(customer.getFirstName());
        }
        System.out.println("_____________________________________");
    }
}

