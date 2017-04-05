package com.restexample.service;

import com.restexample.model.Laptop;
import com.restexample.model.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Service
@Transactional
public class LaptopServiceImpl {

    @Autowired
    LaptopRepository repository;

    public List<Laptop> findAll(){
        return repository.findAll();
    }

    public Laptop findOne(int idLaptop){
        return repository.findOne(idLaptop);
    }

    public void save(Laptop laptop){
        repository.save(laptop);
    }

    public void delete(int idLaptop){
        repository.delete(idLaptop);
    }
}
