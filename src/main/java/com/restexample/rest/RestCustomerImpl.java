package com.restexample.rest;

import com.restexample.model.Customer;
import com.restexample.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by jorge.lopez on 4/4/2017.
 */
@Component
public class RestCustomerImpl implements RestCustomer {

    @Autowired
    CustomerServiceImpl service;

    @Override
    public List<Customer> findAll() {
        return service.findAll();
    }

    @Override
    public Customer findOne(int idCustomer) {
        return service.findOne(idCustomer);
    }

    @Override
    public void addCustomer(Customer customer) {
        service.save(customer);
    }

    @Override
    public void deleteCustomer(int idCustomer) {
        service.delete(idCustomer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        service.save(customer);
    }
}
