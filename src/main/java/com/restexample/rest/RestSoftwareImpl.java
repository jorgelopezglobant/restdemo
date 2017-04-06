package com.restexample.rest;

import com.restexample.model.Software;
import com.restexample.service.SoftwareServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Component
public class RestSoftwareImpl implements RestSoftware {

    @Autowired
    SoftwareServiceImpl service;

    @Override
    public List<Software> findAll() {
        return service.findAll();
    }

    @Override
    public Software findOne(int idSoftware) {
        return service.findOne(idSoftware);
    }

    @Override
    public void save(Software software) {
        service.save(software);
    }

    @Override
    public void update(Software software) {
        service.save(software);
    }

    @Override
    public void delete(int idSoftware) {
        service.delete(idSoftware);
    }
}
