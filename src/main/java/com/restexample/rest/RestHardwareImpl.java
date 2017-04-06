package com.restexample.rest;

import com.restexample.model.Hardware;
import com.restexample.service.HardwareServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by jorge.lopez on 6/4/2017.
 */
@Component
public class RestHardwareImpl implements RestHardware {

    @Autowired
    HardwareServiceImpl service;

    @Override
    public List<Hardware> findAll() {
        return service.findAll();
    }

    @Override
    public Hardware findOne(int idHardware) {
        return service.findOne(idHardware);
    }

    @Override
    public void save(Hardware hardware) {
        service.save(hardware);
    }

    @Override
    public void delete(int idHardware) {
        service.delete(idHardware);
    }

    @Override
    public void update(Hardware hardware) {
        service.save(hardware);
    }
}
