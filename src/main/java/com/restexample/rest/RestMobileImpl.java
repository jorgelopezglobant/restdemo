package com.restexample.rest;

import com.restexample.model.Mobile;
import com.restexample.service.MobileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Component
public class RestMobileImpl implements RestMobile{

    @Autowired
    MobileServiceImpl service;

    @Override
    public List<Mobile> findAll() {
        return service.findAll();
    }

    @Override
    public Mobile findOne(int idMobile) {
        return service.findOne(idMobile);
    }

    @Override
    public void save(Mobile mobile) {
        service.save(mobile);
    }

    @Override
    public void delete(int idMobile) {
        service.delete(idMobile);
    }

    @Override
    public void update(Mobile mobile) {
        service.save(mobile);
    }
}
