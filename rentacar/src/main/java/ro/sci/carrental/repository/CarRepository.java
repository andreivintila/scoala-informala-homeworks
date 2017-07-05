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
    <T> List<T> findAll();

    /**
     * Return all the cars of a certain maker
     * @param v
     * @return List<Car>
     */
    <T extends Car, V> List<T> findCarsByMake(V v);


    /**
     * Adds a car in the system
     * @param car
     */
    <T> void add(T car);

    /**
     *
     */
    <T> void delete(T car);

    /**
     * updates a car in the system
     * @param car
     */
    <T> void update(T car);
}
