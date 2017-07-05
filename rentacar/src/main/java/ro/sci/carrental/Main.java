package ro.sci.carrental;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.VehicleCategory;
import ro.sci.carrental.repository.CustomerRepositoryImpl;
import ro.sci.carrental.simulation.CarSimulation;
import ro.sci.carrental.simulation.CustomerSimulation;


/**
 * This is the Main method from where we can aplly all those methods above
 *
 * @author Vintila Andrei
 */
public class Main {

    public static void main(String[] args) {
        // initializam masini
        Car mercedes = new Car();
        mercedes.setMake("mercedes");
        Car audi = new Car();
        audi.setMake("audi");

        //adaugam masini in repository
        CarRepositoryImpl carRepository = new CarRepositoryImpl();
        carRepository.add(mercedes);
        carRepository.add(audi);

        //initializam clienti
        Customer customer1 = new Customer();
        customer1.setFirstName("Virgil");
        Customer customer2 = new Customer();
        customer2.setFirstName("Ioan");

        //adaugam clinetii in repository
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
        customerRepository.add(customer1);
        customerRepository.add(customer2);

        //cautam masini
        CarSimulation carSimulation = new CarSimulation();
        carSimulation.searches(carRepository);

        //cautam clienti
        CustomerSimulation customerSimulation = new CustomerSimulation();
        customerSimulation.searches(customerRepository);

        //stergem o masina din repository
        carRepository.delete(audi);
        System.out.println("Lista masinilor din CarRepositoryImpl este: ");
        for (Car car : carRepository.findAll()) {
            System.out.println(car.getMake());
        }
        System.out.println("_____________________________________");


    }
}