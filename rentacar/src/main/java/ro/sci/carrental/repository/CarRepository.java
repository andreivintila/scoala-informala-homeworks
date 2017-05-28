package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.util.FuelType;

import java.util.ArrayList;
import java.util.List;

/**
 * repository interface for Car, this will help managing all persistence operations.
 *
 * @author Vintila Andrei
 */
public interface CarRepository {

    /**
     * Adds a car in the system.
     * @return
     */
    List<Car> getAll();

    /**
     * Return all the cars of a certain maker
     * @param make
     * @return List<Car>
     */
    List<Car> getCarsByMake(String make);

    /**
     * Return all cars by fuel type
     * @param fuelType
     * @return List<Car>
     */
    List<Car> getCarsByFuelType(FuelType fuelType);

    /**
     * Adds a car in the system
     * @param car
     */
    void add(Car car);

    /**
     * deletes a car in the system
     * @param car
     */
    void delete(Car car);

    /**
     * updates a car in the system
     * @param car
     */
    void update(Car car);
}
