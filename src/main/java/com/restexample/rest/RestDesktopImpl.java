package com.restexample.rest;

import com.restexample.model.Desktop;
import com.restexample.service.DesktopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Component
public class RestDesktopImpl implements RestDesktop{

    @Autowired
    DesktopServiceImpl service;

    @Override
    public List<Desktop> findAll() {
        return service.findAll();
    }

    @Override
    public Desktop findOne(int idDesktop) {
        return service.findOne(idDesktop);
    }

    @Override
    public void save(Desktop desktop) {
        service.save(desktop);
    }

    @Override
    public void delete(int idDesktop) {
        service.delete(idDesktop);
    }

    @Override
    public void update(Desktop desktop) {
        service.save(desktop);
    }
}
