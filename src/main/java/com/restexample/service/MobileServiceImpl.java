package com.restexample.service;

import com.restexample.model.Mobile;
import com.restexample.model.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Service
@Transactional
public class MobileServiceImpl {

    @Autowired
    MobileRepository repository;

    public List<Mobile> findAll(){
        return repository.findAll();
    }

    public Mobile findOne(int idMobile){
        return repository.findOne(idMobile);
    }

    public void save(Mobile mobile){
        repository.save(mobile);
    }

    public void delete(int idMobile){
        repository.delete(idMobile);
    }
}

