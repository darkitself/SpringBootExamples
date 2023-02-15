package com.example.springbootexamples.beans.market;

import com.example.springbootexamples.beans.car.Car;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Market {
    List<Car> availableCars;

    @PostConstruct
    public void postConstruct() {
        availableCars.forEach(
                c -> System.out.printf("Car %s in stock in market %n", c.hashCode())
        );
    }
}
