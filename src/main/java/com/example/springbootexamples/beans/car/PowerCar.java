package com.example.springbootexamples.beans.car;

import com.example.springbootexamples.beans.engine.Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PowerCar extends Car {

    public PowerCar(@Qualifier(value = "powerEngine") Engine engine) {
        super(engine);
    }
}
