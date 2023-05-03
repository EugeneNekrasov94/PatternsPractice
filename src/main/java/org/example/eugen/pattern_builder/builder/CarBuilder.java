package org.example.eugen.pattern_builder.builder;

import org.example.eugen.pattern_builder.cars.Car;
import org.example.eugen.pattern_builder.cars.CarType;
import org.example.eugen.pattern_builder.components.*;

public class CarBuilder implements Builder {
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private Brakes brakes;
    private Seats seats;
    private GPSNavi gpsNavi;

    @Override
    public Builder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setBrakes(Brakes brakes) {
        this.brakes = brakes;
        return this;
    }

    @Override
    public Builder setSeats(Seats seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setGPSNavi(GPSNavi gpsNavi) {
        this.gpsNavi = gpsNavi;
        return this;
    }

    public Car getResult() {
        return new Car(carType,engine,transmission,brakes,seats,gpsNavi);
    }
}
