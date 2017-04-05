package com.restexample.service;

import com.restexample.model.CustomerRepository;
import com.restexample.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jorge.lopez on 4/4/2017.
 */
@Service
@Transactional
public class CustomerServiceImpl {

    @Autowired
    CustomerRepository customerRep;

    public Customer findOne(int idCustomer){
        return customerRep.findOne(new Integer(idCustomer));
    }

    public List<Customer> findAll(){
        return customerRep.findAll();
    }

    public void save(Customer customer){
        customerRep.save(customer);
    }

    public void delete(int idCustomer){
        customerRep.delete(new Integer(idCustomer));
    }

}
