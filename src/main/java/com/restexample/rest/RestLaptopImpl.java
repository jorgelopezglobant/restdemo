package com.restexample.rest;

import com.restexample.model.Laptop;
import com.restexample.service.LaptopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Component
public class RestLaptopImpl implements RestLaptop {

    @Autowired
    LaptopServiceImpl service;
    

    @Override
    public List<Laptop> findAll() {
        return service.findAll();
    }

    @Override
    public Laptop findOne(int idLaptop) {
        return service.findOne(idLaptop);
    }

    @Override
    public void save(@RequestBody Laptop laptop) {
        service.save(laptop);
    }

    @Override
    public void delete(int idLaptop) {
        service.delete(idLaptop);
    }

    @Override
    public void update(@RequestBody Laptop laptop) {
        service.save(laptop);
    }
}
