package ro.sci.carrental.reader;

import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.domain.customer.CustomerAddress;
import ro.sci.carrental.domain.customer.PayMethod;

/**
 * Created by ADMIN on 23-Jul-17.
 */
public class CustomerConvertor implements Convertor<Customer> {

    @Override
    public Customer convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split(",");

        if (tokens.length != 6) {
            throw new InvalidEntityException("Invalid Customer Description");
        }

        Customer customer = new Customer();
        customer.setFirstName(tokens[0]);
        customer.setLastName(tokens[1]);
        customer.setTelephone(tokens[2]);
        customer.setCustomerAddress(new CustomerAddress(tokens[3], tokens[4]));
        customer.setPayMethod(PayMethod.valueOf(tokens[5].toUpperCase()));

        return customer;
    }
}

