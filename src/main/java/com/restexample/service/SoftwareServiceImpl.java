package com.restexample.service;

import com.restexample.model.Software;
import com.restexample.model.SoftwareRepository;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Service
@Transactional
public class SoftwareServiceImpl {

    @Autowired
    SoftwareRepository repository;

    public List<Software> findAll(){
        return repository.findAll();
    }

    public Software findOne(int idSoftware){
        return repository.findOne(new Integer(idSoftware));
    }

    public void save(Software software){
        repository.save(software);
    }

    public void delete(int idSoftware){
        repository.delete(new Integer(idSoftware));
    }

}
