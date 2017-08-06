package ro.sci.carrental.simulation;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ADMIN on 04-Jul-17.
 */
    public class CarSimulation<T extends Car> {
        private static final Logger LOGGER = Logger.getLogger("RentingSimulation");

        public void searches(CarRepository carRepository) {
            LOGGER.log(Level.INFO, "\nLista masinilor din CarRepositoryImpl este: {0}\n", carRepository.getAll());
        }
}