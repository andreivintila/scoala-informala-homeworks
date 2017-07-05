package ro.sci.carrental.tests;

import org.junit.Test;
import ro.sci.carrental.domain.calendar.Interval;
import ro.sci.carrental.domain.car.Price;

import static org.junit.Assert.assertEquals;

/**
 * Created by ADMIN on 05-Jul-17.
 */
public class PriceTest {

    @Test
    public void testCalculatePrice(){

        //given
        Price price = new Price(10);
        Interval interval = new Interval(5);

        //then
        double rentPrice = price.getPricePerDay() * interval.getInterval();

        //evaluate
        double expected = 50;
        assertEquals(expected, rentPrice);
    }


}
