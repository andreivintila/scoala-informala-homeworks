package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;

import java.util.Collection;
import java.util.List;

/**
 * repository interface for Car, this will help managing all persistence operations.
 *
 * @author Vintila Andrei
 */
public interface CarRepository {

    /**
     * Get all the cars in the system.
     * @return
     */
    List<Car> findAll();

    /**
     * Return all the cars of a certain maker
     * @param make
     * @return List<Car>
     */
    List<Car> findCarsByMake(String make);


    /**
     * Adds a car in the system
     * @param car
     */
    void create(Car car);

    /**
     *
     */
    void delete(Car car);

    /**
     * updates a car in the system
     * @param car
     */
    void update(Car car);
}
