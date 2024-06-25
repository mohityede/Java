package com.themohit.DI_project.service;

import com.themohit.DI_project.model.Laptop;
import com.themohit.DI_project.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo repo;

    public void addLaptop(Laptop lapy) {
        repo.save(lapy);
        System.out.println("Laptop added successfully.");
    }

    public boolean isGoodForCoding() {
        return true;
    }
}
