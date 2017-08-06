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
public interface CarRepository<T extends Car>  extends Repository<T>{
    /**
     * Get all cars in the system
     *
     * @return List<Car>
     */
    List<T> getAll();

    /**
     * Return all the cars of a certain maker
     *
     * @param v
     * @return List<Car>
     */
    List<T> getCarsByMake(String v);

    /**
     * Return all cars by fuel type
     *
     * @param v
     * @return List<Car>
     */
    List<T> getCarsByFuelType(String v);

    /**
     * Add a car in the system.
     *
     * @param t
     */
    void add(T t);

    /**
     * Add all cars in the system.
     *
     * @param t
     */
    void addAll(List<T> t);

    /**
     * Delete a car from the system.
     *
     * @param t
     */
    void delete(T t);

    /**
     * Updates car information in the system.
     *
     * @param t
     */
    void update(T t);

    void reserve(T t);

    void freeup(T t);

    int getCapacity();
}