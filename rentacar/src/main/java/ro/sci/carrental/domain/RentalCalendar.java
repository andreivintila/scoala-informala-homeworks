package ro.sci.carrental.domain;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

/**
 * RentalCalendar class schedules a rental for a car
 *
 * @author Vintila Andrei
 */
public class RentalCalendar {

    /**
     * Public method pickupTime() simulates the car pickup by a client at some time
     * @param car the object car in use
     * @param customer the customer
     * @param date date and time of pickup
     */
    public void pickupTime(Car car, Customer customer, String date) {
        System.out.println("Automobilul " + car.getMake() + " " + car.getModel()+ " va fi ridicat de " +
                customer.getFirstName() + " " + customer.getLastName() + " la data si ora " + date);

    }

    /**
     * Public method returnTime() simulates the return of a car previously picked up at some time
     * @param car object of car in use
     * @param customer the custumer
     * @param date date and time of return
     */
    public void returnTime(Car car, Customer customer, String date) {
        System.out.println("Automobilul " + car.getMake() + " " + car.getModel()+ " va fi inapoiat de " +
                customer.getFirstName() + " " + customer.getLastName() + " la data si ora " + date);
    }
}