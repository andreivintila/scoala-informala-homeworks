package ro.sci.carrental.service;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 21-May-17.
 */
public class SearchService {

    private CarRepository carRepository;

    public SearchService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findCarsByMakeModel(String make, String model) {
        List<Car> foundCars = new ArrayList<Car>();

        for (Car car : carRepository.getCars()) {
            if (car.getMake().equals(make) && car.getModel().equals(model)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public List<Car> findCarsByCategories(String make, String model, String category, String fueltype, String color,  String gearbox, Integer noofdors, Integer noofseats, String avalability){
        List<Car> foundCars = new ArrayList<Car>();
        for (Car car : carRepository.getCars()){
            if(car.getMake().equals(make) && car.getModel().equals(model) && car.getCategory(category) && car.getFueltype(fueltype) && car.getColor(color) && car.getGearbox(gearbox) && car.getNoofdors(noofdors) && car.getNoofseats(noofseats) && car.getAvalability(avalability)){
                foundCars.add(car);

            }
        }
        return foundCars;
    }
}
