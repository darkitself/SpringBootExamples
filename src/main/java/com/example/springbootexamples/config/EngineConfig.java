package com.example.springbootexamples.config;

import com.example.springbootexamples.beans.engine.EcoEngine;
import com.example.springbootexamples.beans.engine.Engine;
import com.example.springbootexamples.beans.engine.PowerEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EngineConfig {

    @Bean
    @Scope(value = "prototype")
    public Engine powerEngine() {
        return new PowerEngine();
    }

    @Bean
    @Scope(value = "prototype")
    public Engine ecoEngine() {
        return new EcoEngine();
    }
}
