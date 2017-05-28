package ro.sci.carrental;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.domain.Customer;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarServiceImpl;
import ro.sci.carrental.util.FuelType;
import ro.sci.carrental.util.VehicleCategory;
import sun.util.resources.cldr.so.CurrencyNames_so;

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
        Customer customer1 = new Customer("Popescu", "Virgil");
        Customer customer2 = new Customer("Mihaila", "Ioan");
        Customer customer3 = new Customer("Cioran", "Petre");

        //introducem masini
        carRepository.add(mercedes);
        carRepository.add(audi);
        carRepository.add(dacia);
        carRepository.add(vw);
        carRepository.add(bmw);

        //efectuam cautari
        searches(carRepository);

    }

    /**
     * Public static void method searches() runs multiple searches criteria
     * @param carRepository holds the values of car list.
     */
    private static void searches(CarRepositoryImpl carRepository) {
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
    }
}
