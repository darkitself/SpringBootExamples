package com.example.springbootexamples.beans.car;

import com.example.springbootexamples.beans.engine.Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LuxuryCar extends Car {

    public LuxuryCar(@Qualifier(value = "powerEngine") Engine engine) {
        super(engine);
    }
}
