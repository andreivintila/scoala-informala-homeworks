package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * implementations of inferface CarRepository
 *
 * @author Vintila Andrei
 */
public class CarRepositoryImpl implements CarRepository {

    private List<Car> cars = new ArrayList<>();

    public List<Car> findAll() {
        return cars;
    }

    public <T extends Car, V> List<T> findCarsByMake(V make) {
        List<T> seachedCars = new ArrayList<>();

        for (ro.sci.carrental.domain.car.Car car: cars) {
            if (cars.contains(car.getMake())) {
                seachedCars.add((T) car);
            }
        }
        return seachedCars;
    }


    public <T> void add(T car) {
        cars.add((Car) car);
    }

    public <T> void delete(T car) {
        cars.removeIf(anotherCar -> anotherCar.equals(car));
    }

    public <T> void update(T car) {
        cars.set(cars.indexOf(car), (Car) car);
    }

}
