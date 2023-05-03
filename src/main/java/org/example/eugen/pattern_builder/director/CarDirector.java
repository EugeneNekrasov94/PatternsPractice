package org.example.eugen.pattern_builder.director;

import org.example.eugen.pattern_builder.builder.Builder;
import org.example.eugen.pattern_builder.cars.CarType;
import org.example.eugen.pattern_builder.components.*;

public class CarDirector {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(Seats.LEATHER);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setBrakes(Brakes.CERAMIC);
        builder.setGPSNavi(new GPSNavi());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(Seats.FIBER);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.VARIABLE);
        builder.setGPSNavi(new GPSNavi());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(Seats.LEATHER);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavi(new GPSNavi());
    }
}
