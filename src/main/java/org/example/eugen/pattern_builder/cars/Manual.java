package org.example.eugen.pattern_builder.cars;

import org.example.eugen.pattern_builder.builder.ManualBuilder;
import org.example.eugen.pattern_builder.components.*;

public class Manual {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private final Brakes brakes;
    private final Seats seats;
    private final GPSNavi gpsNavi;
    private double fuel = 0.0;

    public Manual(CarType carType, Engine engine, Transmission transmission, Brakes brakes, Seats seats,GPSNavi gpsNavi) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.brakes = brakes;
        this.seats = seats;
        this.gpsNavi = gpsNavi;
    }

    public Manual(ManualBuilder manualBuilder) {
        this.carType = manualBuilder.getCarType();
        this.gpsNavi = manualBuilder.getGpsNavi();
        this.brakes = manualBuilder.getBrakes();
        this.engine = manualBuilder.getEngine();
        this.transmission = manualBuilder.getTransmission();
        this.seats = manualBuilder.getSeats();
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Type of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";

        if (this.gpsNavi != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }

    @Override
    public String toString() {
        return "Manual{" +
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
