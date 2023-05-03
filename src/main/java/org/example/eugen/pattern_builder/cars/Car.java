package org.example.eugen.pattern_builder.cars;

import org.example.eugen.pattern_builder.components.*;

public class Car {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private final Brakes brakes;
    private final Seats seats;
    private final GPSNavi gpsNavi;
    private double fuel = 0.0;

    public Car(CarType carType, Engine engine, Transmission transmission, Brakes brakes, Seats seats,GPSNavi gpsNavi) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.brakes = brakes;
        this.seats = seats;
        this.gpsNavi = gpsNavi;
    }

    public CarType getCarType() {
        return carType;
    }

    public Seats getSeats() {
        return seats;
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

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", brakes=" + brakes +
                ", seats=" + seats +
                ", gpsNavi=" + gpsNavi +
                ", fuel=" + fuel +
                '}';
    }
}
