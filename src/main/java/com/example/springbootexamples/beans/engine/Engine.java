package com.example.springbootexamples.beans.engine;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PROTECTED;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = PROTECTED)
public abstract class Engine {

    @NonNull
    Integer power;
    Boolean isEnabled = false;

    public void start() {
        isEnabled = true;
    }

    public void stop() {
        isEnabled = false;
    }
}
