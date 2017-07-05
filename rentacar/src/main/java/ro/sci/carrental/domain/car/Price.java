package ro.sci.carrental.domain.car;

/**
 * Created by ADMIN on 05-Jul-17.
 */
public class Price {
        private double pricePerDay;

    public Price(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
