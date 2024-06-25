package com.themohit.DI_project.repository;

import com.themohit.DI_project.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {

    public void save(Laptop lapy) {
        System.out.println("Laptop seved into DB.");
    }
}
