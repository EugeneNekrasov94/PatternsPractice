package org.example.eugen.pattern_builder.builder;

import org.example.eugen.pattern_builder.cars.Manual;
import org.example.eugen.pattern_builder.cars.CarType;
import org.example.eugen.pattern_builder.components.*;

public class ManualBuilder implements Builder {
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private Brakes brakes;
    private Seats seats;
    private GPSNavi gpsNavi;

    @Override
    public ManualBuilder setGPSNavi(GPSNavi gpsNavi) {
        this.gpsNavi = gpsNavi;
        return this;
    }

    @Override
    public ManualBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public ManualBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public ManualBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public ManualBuilder setBrakes(Brakes brakes) {
        this.brakes = brakes;
        return this;
    }

    @Override
    public ManualBuilder setSeats(Seats seats) {
        this.seats = seats;
        return this;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public Seats getSeats() {
        return seats;
    }

    public GPSNavi getGpsNavi() {
        return gpsNavi;
    }

    public Manual getResult() {
        return new Manual(this);
    }
}
