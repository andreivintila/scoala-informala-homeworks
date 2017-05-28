package ro.sci.carrental;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.domain.Customer;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarServiceImpl;
import ro.sci.carrental.service.CustomerServiceImpl;
import ro.sci.carrental.util.CustomerAddress;
import ro.sci.carrental.util.FuelType;
import ro.sci.carrental.util.VehicleCategory;
import ro.sci.carrental.util.PayMethod;
import ro.sci.carrental.repository.CustomerRepositoryImpl;
import java.util.List;


/**
 * This is the Main method from where we can aplly all those methods above
 *
 * @author Vintila Andrei
 */
public class Main {
    public static void main(String[] args) {
        // initializam masini
        Car mercedes = new Car("Mercedes", "e220", VehicleCategory.SEDAN, FuelType.DIESEL, "Yellow",5, 4, 4, true);
        Car audi = new Car("Audi", "A8", VehicleCategory.LIMOUSINE, FuelType.GASOLINE, "Black",6, 4, 4, false);
        Car dacia = new Car("Dacia", "Logan", VehicleCategory.SEDAN, FuelType.GASOLINE, "White",4, 4, 5, true);
        Car vw = new Car("Volkswagen", "Touareg", VehicleCategory.JEEP, FuelType.DIESEL, "Blue",6, 4, 5, true);
        Car bmw = new Car("BMW", "z3", VehicleCategory.SPORT, FuelType.DIESEL, "Red",6, 2, 2, true);
        CarRepositoryImpl carRepository = new CarRepositoryImpl();

        //initializam clienti
        CustomerAddress customerAddress1 = new CustomerAddress("Romania", "Sibiu", "Str Avrig, nr. 2");
        Customer customer1 = new Customer("Popescu", "Virgil", "0745909213", customerAddress1, PayMethod.CASH);
        CustomerAddress customerAddress2 = new CustomerAddress("Romania", "Iasi", "Str Paris, nr. 12");
        Customer customer2 = new Customer("Mihaila", "Ioan", "0745212333", customerAddress2, PayMethod.DEBITCARD);
        CustomerAddress customerAddress3 = new CustomerAddress("Romania", "Cluj-Napoca", "Str Gladiolelor, nr. 3");
        Customer customer3 = new Customer("Cioran", "Petre","0788996331", customerAddress3, PayMethod.DEBITCARD);
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

        //introducem masini
        carRepository.add(mercedes);
        carRepository.add(audi);
        carRepository.add(dacia);
        carRepository.add(vw);
        carRepository.add(bmw);

        //introducem clinetii
        customerRepository.add(customer1);
        customerRepository.add(customer2);
        customerRepository.add(customer3);
        //efectuam cautari
        searchescars(carRepository);
        searchescustomers(customerRepository);

    }

    /**
     * Public static void method searches() runs multiple searches criteria
     * @param carRepository holds the values of car list.
     */
    private static void searchescars(CarRepositoryImpl carRepository) {
        //cautarea tuturor masinilor
        System.out.println("Lista masinilor din CarRepositoryImp este: ");
        for (Car car : carRepository.getAll()) {
            System.out.println(car.getMake());
        }
        System.out.println("_____________________________________");

        //cautare dupa marca
        CarServiceImpl search1 = new CarServiceImpl(carRepository);
        List<Car> foundCarsByMake = search1.findCarsByMake("Audi");

        System.out.println("Cautarea dupa Marca returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMake) {
            System.out.println(car.getMake() + " " + car.getModel());
        }
        System.out.println("_____________________________________");

        //cautare dupa marca si model
        CarServiceImpl search2 = new CarServiceImpl(carRepository);
        List<Car> foundCarsByMakeAndModel = search2.findCarsByMakeAndModel("Mercedes", "e220");

        System.out.println("Cautarea dupa Marca si Model returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMakeAndModel) {
            System.out.println(car.getMake() + " " + car.getModel());
        }
        System.out.println("_____________________________________");

        //cautare dupa Marca, Model, Culoare si Locuri
        CarServiceImpl search3 = new CarServiceImpl(carRepository);
        List<Car> foundCarsByMultipleCategories = search3.findCarsByMultipleCategories(
                "Dacia", "Logan", "White", 5);

        System.out.println("Cautarea dupa Marca, Model, Culoare si Locuri returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMultipleCategories) {
            System.out.println(car.getMake() + " " + car.getModel());
        }
        System.out.println("_____________________________________");
        System.out.println("#####################################");
        System.out.println("");
    }

    public static void searchescustomers(CustomerRepositoryImpl customerRepository) {
        //cautarea tuturor clientilor
        System.out.println("Lista clientilor din sistem este: ");
        for (Customer customer : customerRepository.getAll()) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        }
        System.out.println("_____________________________________");

        //cautare dupa numele de familie
        CustomerServiceImpl search4 = new CustomerServiceImpl(customerRepository);
        List<Customer> foundCustomersByLastName = search4.findCustomerByLastName("Cioran");

        System.out.println("Cautarea dupa numele de familie returneaza urmatorii clienti: ");
        for (Customer customer : foundCustomersByLastName) {
            System.out.println(customer.getLastName() + " " + customer.getFirstName());
        }
        System.out.println("_____________________________________");

        //cautare dupa telefon
        CustomerServiceImpl search5 = new CustomerServiceImpl(customerRepository);
        List<Customer> foundCustomersByTelephone = search5.findCustomerByTelephone("0745212333");

        System.out.println("Cautarea dupa numele de familie returneaza urmatorii clienti: ");
        for (Customer customer : foundCustomersByTelephone) {
            System.out.println(customer.getLastName() + " " + customer.getFirstName());
        }
        System.out.println("_____________________________________");
        System.out.println("#####################################");
    }
}
