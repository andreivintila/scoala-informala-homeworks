package ro.sci.carrental.reader;

/**
 * Created by ADMIN on 23-Jul-17.
 */

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;
import ro.sci.carrental.domain.car.Price;
import ro.sci.carrental.domain.car.VehicleCategory;

public class CarConvertor implements Convertor<Car> {

    @Override
    public Car convert(String convertedString) throws InvalidEntityException {

        String[] tokens = convertedString.split(",");

        if (tokens.length != 10) {
            throw new InvalidEntityException("Invalid Car Description");
        }

        Car car = new Car();
        car.setMake(tokens[0]);
        car.setModel(tokens[1]);
        car.setCategory(VehicleCategory.valueOf(tokens[2].toUpperCase()));
        car.setFueltype(FuelType.valueOf(tokens[3].toUpperCase()));
        car.setColor(tokens[4]);
        car.setGearbox(Integer.valueOf(tokens[5]));
        car.setNoofseats(Integer.valueOf(tokens[6]));
        car.setNoofdoors(Integer.valueOf(tokens[7]));
        car.isAvailable(Boolean.valueOf(tokens[8]));
        car.setRentPrice(new Price(Double.valueOf(tokens[9])));

        return car;
    }

}
