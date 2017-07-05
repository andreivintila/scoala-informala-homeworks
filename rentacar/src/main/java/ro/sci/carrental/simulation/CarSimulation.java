package ro.sci.carrental.simulation;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepositoryImpl;

/**
 * Created by ADMIN on 04-Jul-17.
 */
public class CarSimulation {
    public void searches(CarRepositoryImpl carRepository) {
        System.out.println("Lista masinilor din CarRepositoryImpl este: ");
        for (Car car : carRepository.findAll()) {
            System.out.println(car.getMake());
        }
        System.out.println("_____________________________________");
        System.out.println("Lista masinilor din CarRepositoryImpl este dupa fabricant: ");
            for (Car car : carRepository.findAll()) {
            if(car.getMake().equalsIgnoreCase("audi"))
            System.out.println(car.getMake());
        }
        System.out.println("_____________________________________");
    }
}