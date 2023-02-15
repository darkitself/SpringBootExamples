package com.example.springbootexamples.beans.car;

import com.example.springbootexamples.beans.engine.Engine;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.annotation.PostConstruct;

import static lombok.AccessLevel.PROTECTED;


@RequiredArgsConstructor
@FieldDefaults(level = PROTECTED)
public abstract class Car {

    @NonNull
    Engine engine;

    Boolean inStock = true;

    @PostConstruct
    public void postConstruct() {
        engine.start();
        System.out.printf("Engine in car enabled: %s%n", engine.getIsEnabled());
        System.out.println(engine.getPower());
    }
}
