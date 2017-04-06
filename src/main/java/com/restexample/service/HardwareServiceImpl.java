package com.restexample.service;

import com.restexample.model.Hardware;
import com.restexample.model.HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jorge.lopez on 6/4/2017.
 */
@Service
@Transactional
public class HardwareServiceImpl {

    @Autowired
    HardwareRepository repository;

    public List<Hardware> findAll(){
        return repository.findAll();
    }

    public Hardware findOne(int idHardware){
        return repository.findOne(idHardware);
    }

    public void save(Hardware hardware){
        repository.save(hardware);
    }

    public void delete(int idHardware){
        repository.delete(idHardware);
    }

}
