package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepositoryImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * implementations of inferface CarService
 *
 * @author Vintila Andrei
 */
public class CarServiceImpl implements CarService {


    private CarRepositoryImpl carRepository;

    public CarServiceImpl(CarRepositoryImpl carRepository) {
        this.carRepository = carRepository;
    }

    /**
     * Searches the car by the make
     * @param make holds the car make
     * @return list of the cars found
     */
    public List<Car> findCarsByMake(String make) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.findAll()) {
            if (car.getMake().equalsIgnoreCase(make)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    /**
     * Searches the car by the make and model
     * @param make holds the car make
     * @param model holds the car model
     * @return list of the cars found
     */
    public List<Car> findCarsByMakeAndModel(String make, String model) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.findAll()) {
            if ((car.getModel().equalsIgnoreCase(model)) && (car.getMake().equalsIgnoreCase(make))) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    /**
     * Searches the car by the make, model, color and noofseats
     * @param make holds the car make
     * @param model holds the car model
     * @param color holds the car color
     * @param noofseats holds the car number of seats
     * @return list of the cars found
     */
    public List<Car> findCarsByMultipleCategories(String make, String model, String color, int noofseats) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.findAll()) {
            if ((car.getModel().equalsIgnoreCase(model)) && (car.getMake().equalsIgnoreCase(make))
                    && (car.getColor().equalsIgnoreCase(color)) && (car.getNoofseats() == noofseats)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
}
