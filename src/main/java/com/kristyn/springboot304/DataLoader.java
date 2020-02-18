package com.kristyn.springboot304;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Cars car;
        car = new Cars(2002, "Ford", "Focus");
        repository.save(car);

        car = new Cars(2015, "Chevy", "Blazer");
        repository.save(car);

        car = new Cars(2019, "Subaru", "Crosstrek");
        repository.save(car);
    }
}