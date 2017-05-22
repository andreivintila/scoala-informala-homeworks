package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Car;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 21-May-17.
 */
public class CarRepository {

    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}
