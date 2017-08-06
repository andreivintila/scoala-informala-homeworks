package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;

import java.util.List;

/**
 * Service interface for Car, this will help managing all persistence operations.
 *
 * @author Vintila Andrei
 */
public interface CarService<T> {

    /**
     * Add to repository
     *
     * @param t generic type
     */
    void add(T t);

    /**
     * Delete from repository
     *
     * @param t generic type
     */
    void delete(T t);

    /**
     * Update element in repository
     *
     * @param t generic type
     */
    void update(T t);

    /**
     * Find same make cars in system.
     *
     * @param v Car make
     * @return List<Car>
     */
    List<T> findCarsByMake(String v);

    /**
     * Find same make and model cars in system.
     *
     * @param make
     * @param model
     * @return List<Car>
     */
    List<T> findCarsByMakeAndModel(String make, String model);

    /**
     * Find same make, model, color and seats cars in system.
     *
     * @param make
     * @param model
     * @param color
     * @return List<Car>
     */
    List<T> findCarsByMakeModelColor(String make, String model, String color);
}

