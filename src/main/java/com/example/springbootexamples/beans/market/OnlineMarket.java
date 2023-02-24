package com.example.springbootexamples.beans.market;

import com.example.springbootexamples.beans.car.Car;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OnlineMarket {
    @Autowired
    List<Car> availableCars;

    @PostConstruct
    public void postConstruct() {
        availableCars.forEach(
                c -> System.out.printf("Car %s in stock in online market %n", c.hashCode())
        );
    }
}
