package ro.sci.carrental;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.reader.*;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.repository.CustomerRepositoryImpl;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CarServiceImpl;
import ro.sci.carrental.service.CustomerService;
import ro.sci.carrental.service.CustomerServiceImpl;
import ro.sci.carrental.simulation.CarSimulation;
import ro.sci.carrental.simulation.CustomerSimulation;
import ro.sci.carrental.writer.CarWriter;
import ro.sci.carrental.writer.CustomerWriter;

import java.io.File;
import java.util.List;


/**
 * This is the Main method from where we can aplly all those methods above
 *
 * @author Vintila Andrei
 */
public class Main {

    public static void main(String[] args) throws InvalidEntityException {

        File carsFile = new File("cars.txt");
        EntityReader entityReader = new EntityReader();
        List<String> carLines = entityReader.readLines(carsFile);
        Convertor<Car> carConvertor = new CarConvertor();
        CarRepository<Car> carRepository = new CarRepositoryImpl();
        CarService<Car> carService = new CarServiceImpl(carRepository);

        for (String line : carLines) {
            carService.add(carConvertor.convert(line));
        }

        File customerFile = new File("customers.txt");
        List<String> customerLines = entityReader.readLines(customerFile);
        Convertor<Customer> customerConvertor = new CustomerConvertor();
        CustomerRepository<Customer> customerRepository = new CustomerRepositoryImpl();
        CustomerService<Customer> customerService = new CustomerServiceImpl(customerRepository);

        for (String line : customerLines) {
            customerService.add(customerConvertor.convert(line));
        }

        //cautam masini
        CarSimulation carSimulation = new CarSimulation();
        carSimulation.searches(carRepository);

        //cautam clienti
        CustomerSimulation customerSimulation = new CustomerSimulation();
        customerSimulation.searches(customerRepository);

        File outCars = new File("outcars.txt");
        CarWriter carWriter = new CarWriter();
        carWriter.writeObjects(carRepository.getAll(), outCars);

        File outCustomers = new File("outcustomers.txt");
        CustomerWriter customerWriter = new CustomerWriter();
        customerWriter.writeObjects(customerRepository.getAll(), outCustomers);


    }
}