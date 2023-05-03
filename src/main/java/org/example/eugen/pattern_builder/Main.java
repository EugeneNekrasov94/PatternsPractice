package org.example.eugen.pattern_builder;

import org.example.eugen.pattern_builder.builder.CarBuilder;
import org.example.eugen.pattern_builder.builder.ManualBuilder;
import org.example.eugen.pattern_builder.cars.Car;
import org.example.eugen.pattern_builder.cars.Manual;
import org.example.eugen.pattern_builder.components.*;
import org.example.eugen.pattern_builder.director.CarDirector;

public class Main {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        CarBuilder builder = new CarBuilder();
        carDirector.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println(car);
        System.out.println("Car built: " + car.getCarType());


        ManualBuilder manualBuilder = new ManualBuilder();
        carDirector.constructCityCar(manualBuilder);
        Manual manual = new ManualBuilder().setEngine(new Engine(2.0,222.2)).setSeats(Seats.LEATHER)
                .setTransmission(Transmission.MANUAL)
                .setGPSNavi(new GPSNavi("SSS"))
                .setBrakes(Brakes.CERAMIC)
                .getResult();
        System.out.println(manual);
        System.out.println("Manual built: " + car.getCarType());
    }
}
