package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;

import java.util.List;

/**
 * Search interface for Car, this will help managing all persistence operations.
 *
 * @author Vintila Andrei
 */
public interface CarService {

    List<Car> findCarsByMake(String make);

    List<Car> findCarsByMakeAndModel(String make, String model);

    List<Car> findCarsByMultipleCategories(String make, String model, String color, int seats);


}

