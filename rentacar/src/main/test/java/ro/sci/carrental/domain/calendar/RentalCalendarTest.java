package ro.sci.carrental.domain.calendar;

import org.junit.jupiter.api.Test;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.Price;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ADMIN on 23-Jul-17.
 */
class RentalCalendarTest {
    @Test
    public void testCalculateRentPrice() {
        Car bmw = new Car();
        bmw.setMake("bmw");
        bmw.setRentPrice(new Price(30.00));

        RentalCalendarImpl result = new RentalCalendarImpl(10,20);
        double actual = result.calculateRentPrice(bmw, 10);

        assertEquals(300, actual, 0);
    }

    @Test
    public void testCalculateRentPriceWithNullPrice() {
        Car mercedes = new Car();
        mercedes.setMake("mercedes");

        RentalCalendarImpl result = new RentalCalendarImpl(10, 20);
        double actual = result.calculateRentPrice(mercedes, 10);

        assertEquals(-1, actual, 0);
    }

}