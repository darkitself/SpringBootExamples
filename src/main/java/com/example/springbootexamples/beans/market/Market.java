package com.example.springbootexamples.beans.market;

import com.example.springbootexamples.beans.car.Car;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Market {

    @Setter(onMethod_ = @Autowired)
    List<Car> availableCars;

    @PostConstruct
    public void postConstruct() {
        availableCars.forEach(
                c -> System.out.printf("Car %s in stock in market %n", c.hashCode())
        );
    }
}
