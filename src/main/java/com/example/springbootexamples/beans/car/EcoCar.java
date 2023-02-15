package com.example.springbootexamples.beans.car;

import com.example.springbootexamples.beans.engine.Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EcoCar extends Car {

    public EcoCar(@Qualifier(value = "ecoEngine") Engine engine) {
        super(engine);
    }
}
