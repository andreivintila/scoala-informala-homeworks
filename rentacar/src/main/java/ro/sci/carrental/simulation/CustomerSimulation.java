package ro.sci.carrental.simulation;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.repository.CustomerRepositoryImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ADMIN on 04-Jul-17.
 */
public class CustomerSimulation {
    private static final Logger LOGGER = Logger.getLogger("RentingSimulation");

    public void searches(CustomerRepository customerRepository) {
        LOGGER.log(Level.INFO, "\nLista clientilor din sistem este: {0}\n", customerRepository.getAll());
    }
}

