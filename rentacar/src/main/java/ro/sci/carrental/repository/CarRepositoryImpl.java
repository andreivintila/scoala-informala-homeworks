package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * implementations of inferface CarRepository
 *
 * @author Vintila Andrei
 */
public class CarRepositoryImpl implements CarRepository {

    private List<Car> cars = new ArrayList<Car>();

    public List<Car> findAll() {
        return cars;
    }

    public List<Car> findCarsByMake(String make) {
        return null;
    }

    public void create(Car car) {
        cars.add(car);
    }

    public void delete(Car car) {
        Iterator it = cars.iterator();
        while (it.hasNext()) {
            if (it.next().equals(car)) {
                it.remove();
            }
        }
    }

    public void update(Car car) {
    }

}
