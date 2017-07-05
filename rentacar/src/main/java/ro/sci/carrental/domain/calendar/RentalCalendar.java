package ro.sci.carrental.domain.calendar;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

/**
 * Created by ADMIN on 05-Jul-17.
 */

/**
 * Interface for scheduling a rental.
 */
public interface RentalCalendar {
    /**
     * Method pickupTime() simulates a car pickup by a client
     * @param car the object car in use
     * @param customer the customer
     * @param date date and time of pickup
     */
    void pickupTime(Car car, Customer customer, String date);
    /**
     * Method returnTime() simulates a return of a car previously picked up
     * @param car object of car in use
     * @param customer the custumer
     * @param date date and time of return
     */
    void returnTime(Car car, Customer customer, String date);

    /**
     * Method calculateRentPrice calculates the rental price of a Car for a given number o rented days.
     * @param car the object car in use
     * @param interval the interval the car is rented
     * @return
     */
    double calculateRentPrice(Car car, Interval interval);
}
