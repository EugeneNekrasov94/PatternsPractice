package org.example.eugen.pattern_builder.builder;

import org.example.eugen.pattern_builder.cars.CarType;
import org.example.eugen.pattern_builder.components.*;

public interface Builder {
    Builder setCarType(CarType carType);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setBrakes(Brakes brakes);
    Builder setSeats(Seats seats);
    Builder setGPSNavi(GPSNavi gpsNavi);
}
