package ro.sci.carrental;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CarServiceImpl;
import ro.sci.carrental.service.CustomerServiceImpl;
import ro.sci.carrental.domain.customer.CustomerAddress;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.VehicleCategory;
import ro.sci.carrental.domain.customer.PayMethod;
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
        Car mercedes = new Car();{
        mercedes.setMake("Mercedes");
        mercedes.setModel("e220");
        mercedes.setCategory(VehicleCategory.SEDAN);
        mercedes.setFueltype(FuelType.DIESEL);
        mercedes.setColor("Yellow");
        mercedes.setGearbox(5);
        mercedes.setNoofdoors(4);
        mercedes.setNoofseats(4);
        mercedes.isAvailable(true);
        }

        Car audi = new Car();{
            audi.setMake("Audi");
            audi.setModel("A8");
            audi.setCategory(VehicleCategory.LIMOUSINE);
            audi.setFueltype(FuelType.GASOLINE);
            audi.setColor("Black");
            audi.setGearbox(6);
            audi.setNoofdoors(4);
            audi.setNoofseats(4);
            audi.isAvailable(false);
        }

        Car dacia = new Car();{
            dacia.setMake("Dacia");
            dacia.setModel("Logan");
            dacia.setCategory(VehicleCategory.SEDAN);
            dacia.setFueltype(FuelType.GASOLINE);
            dacia.setColor("White");
            dacia.setGearbox(4);
            dacia.setNoofdoors(4);
            dacia.setNoofseats(5);
            dacia.isAvailable(true);
        }

        Car vw = new Car();{
            vw.setMake("Volkswagen");
            vw.setModel("Touareg");
            vw.setCategory(VehicleCategory.JEEP);
            vw.setFueltype(FuelType.GASOLINE);
            vw.setColor("Blue");
            vw.setGearbox(6);
            vw.setNoofdoors(4);
            vw.setNoofseats(4);
            vw.isAvailable(true);
        }

        Car bmw = new Car();{
            bmw.setMake("BMW");
            bmw.setModel("z3");
            bmw.setCategory(VehicleCategory.SPORT);
            bmw.setFueltype(FuelType.DIESEL);
            bmw.setColor("Red");
            bmw.setGearbox(6);
            bmw.setNoofdoors(2);
            bmw.setNoofseats(2);
            bmw.isAvailable(true);
        }

        CarRepositoryImpl carRepository = new CarRepositoryImpl();

        //initializam clienti
        CustomerAddress customerAddress1 = new CustomerAddress();{
            customerAddress1.setCountry("Romania");
            customerAddress1.setCity("Sibiu");
            customerAddress1.setStreetAddress("Str Avrig, nr. 2");
        }

        Customer customer1 = new Customer();{
            customer1.setFirstName("Virgil");
            customer1.setLastName("Popescu");
            customer1.setTelephone("0745909213");
            customer1.setCustomerAddress(customerAddress1);
            customer1.setPayMethod(PayMethod.CASH);
        }

        CustomerAddress customerAddress2 = new CustomerAddress();{
            customerAddress2.setCountry("Romania");
            customerAddress2.setCity("Iasi");
            customerAddress2.setStreetAddress("Str Paris, nr. 12");
        }

        Customer customer2 = new Customer();{
            customer2.setFirstName("Ioan");
            customer2.setLastName("Mihaila");
            customer2.setTelephone("0745212333");
            customer2.setCustomerAddress(customerAddress2);
            customer2.setPayMethod(PayMethod.DEBITCARD);
        }

       CustomerAddress customerAddress3 = new CustomerAddress();{
            customerAddress2.setCountry("Romania");
            customerAddress2.setCity("Cluj-Napoca");
            customerAddress2.setStreetAddress("Str Gladiolelor, nr. 3");
        }

       Customer customer3 = new Customer();{
            customer3.setFirstName("Petre");
            customer3.setLastName("Cioran");
            customer3.setTelephone("0788996331");
            customer3.setCustomerAddress(customerAddress3);
            customer3.setPayMethod(PayMethod.DEBITCARD);
        }

       CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

        //introducem masini
        carRepository.create(mercedes);
        carRepository.create(audi);
        carRepository.create(dacia);
        carRepository.create(vw);
        carRepository.create(bmw);



        //introducem clinetii
        customerRepository.add(customer1);
        customerRepository.add(customer2);
        customerRepository.add(customer3);

        //efectuam cautari
        searchescars(carRepository);
        searchescustomers(customerRepository);
        deletecars(carRepository);


    }

    /**
     * Public static void method searches() runs multiple searches criteria
     * @param carRepository holds the values of car list.
     */
    private static void searchescars(CarRepositoryImpl carRepository) {
        //cautarea tuturor masinilor
        System.out.println("Lista masinilor din CarRepositoryImp este: ");
        for (Car car : carRepository.findAll()) {
            System.out.println(car.getMake());
        }
        System.out.println("_____________________________________");

        //cautare dupa marca
        CarServiceImpl search1 = new CarServiceImpl(carRepository);
        List<Car> foundCarsByMake = search1.findCarsByMake("Mercedes");

        System.out.println("Cautarea dupa Marca returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMake) {
            System.out.println(car.getMake() + " " + car.getModel());
        }
        System.out.println("_____________________________________");

        //cautare dupa marca si model
      CarServiceImpl search2 = new CarServiceImpl(carRepository);
       List<Car> foundCarsByMakeAndModel = search2.findCarsByMakeAndModel("BMW", "z3");

       System.out.println("Cautarea dupa Marca si Model returneaza urmatoarele masini: ");
       for (Car car : foundCarsByMakeAndModel) {
            System.out.println(car.getMake() + " " + car.getModel());
        }
       System.out.println("_____________________________________");

       //cautare dupa Marca, Model, Culoare si Locuri
        CarServiceImpl search3 = new CarServiceImpl(carRepository);
       List<Car> foundCarsByMultipleCategories = search3.findCarsByMultipleCategories("Dacia", "Logan", "White", 5);

       System.out.println("Cautarea dupa Marca, Model, Culoare si Locuri returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMultipleCategories) {
           System.out.println(car.getMake() + " " + car.getModel());
        }
       System.out.println("_____________________________________");
    }

    private static void deletecars(CarRepositoryImpl carRepository){
        carRepository.delete(bmw);
        System.out.println("Lista masinilor din CarRepositoryImpl dupa stergere este: ");
        for (Car car : carRepository.findAll()) {
            System.out.println(car.getMake());
        }
        System.out.println("_____________________________________");

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

        System.out.println("Cautarea dupa numarul de telefon returneaza urmatorii clienti: ");
        for (Customer customer : foundCustomersByTelephone) {
            System.out.println(customer.getLastName() + " " + customer.getFirstName());
        }
        System.out.println("_____________________________________");
    }
}
