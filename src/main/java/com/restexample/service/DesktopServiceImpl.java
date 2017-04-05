package com.restexample.service;

import com.restexample.model.Desktop;
import com.restexample.model.DesktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.security.krb5.internal.crypto.Des;

import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Service
@Transactional
public class DesktopServiceImpl {

    @Autowired
    DesktopRepository repository;

    public List<Desktop> findAll(){
        return repository.findAll();
    }

    public Desktop findOne(int idDesktop){
        return repository.findOne(new Integer(idDesktop));
    }

    public void delete(int idDesktop){
        repository.delete(idDesktop);
    }

    public void save(Desktop desktop){
        repository.save(desktop);
    }

}
