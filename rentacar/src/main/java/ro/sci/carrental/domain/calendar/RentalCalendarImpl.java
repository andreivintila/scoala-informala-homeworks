package ro.sci.carrental.domain.calendar;


import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

/**
 * Created by ADMIN on 05-Jul-17.
 */

/**
 * Implementation of calendar Interface
 *
 */
public class RentalCalendarImpl implements RentalCalendar{



    public void pickupTime(Car car, Customer customer, String date) {
        System.out.println("Automobilul " + car.getMake() + " va fi ridicat de catre clientul "
                + customer.getLastName() + " la data si ora " + date);
        car.isAvailable(true);
    }


    public void returnTime(Car car, Customer customer, String date) {
        System.out.println("Automobilul " + car.getMake() + " va fi inapoiat de catre clientul " +
                customer.getLastName() + " la data si ora " + date);
        car.isAvailable(false);
    }

    public double calculateRentPrice(Car car, Interval interval) {

        return car.getRentPrice().getPricePerDay() * interval.getInterval();
    }

}