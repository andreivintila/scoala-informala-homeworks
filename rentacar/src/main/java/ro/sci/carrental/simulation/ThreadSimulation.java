package ro.sci.carrental.simulation;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.dispatcher.CarDispatcher;
import ro.sci.carrental.service.CarService;

public class ThreadSimulation {

    public static void simulate(CarService<Car> carService) throws InterruptedException {
        CarDispatcher carRentalDispatcher = new CarDispatcher();
        Thread rentCar1 = new Thread(new Runnable() {
            @Override
            public void run() {
                carRentalDispatcher.rent(carService.findCarsByMake("VW").get(0));
            }
        });

        Thread rentCar2 = new Thread(new Runnable() {
            @Override
            public void run() {
                carRentalDispatcher.rent(carService.findCarsByMake("Skoda").get(0));
            }
        });

        Thread rentCar3 = new Thread(new Runnable() {
            @Override
            public void run() {
                carRentalDispatcher.rent(carService.findCarsByMake("Aro").get(0));
            }
        });

        Thread rentCar4 = new Thread(new Runnable() {
            @Override
            public void run() {
                carRentalDispatcher.rent(carService.findCarsByMake("Opel").get(0));
            }
        });


        Thread freeupCar1 = new Thread(new Runnable() {
            @Override
            public void run() {
                carRentalDispatcher.returnCar(carService.findCarsByMake("VW").get(0));
            }
        });

        rentCar1.start();
        rentCar2.start();
        rentCar3.start();
        rentCar4.start();
        freeupCar1.start();

        rentCar1.join();
        rentCar2.join();
        rentCar3.join();
        rentCar4.join();
        freeupCar1.join();
    }

}
