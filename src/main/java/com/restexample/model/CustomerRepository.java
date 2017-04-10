package com.restexample.model;

import com.restexample.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jorge.lopez on 4/4/2017.  
 */
public interface CustomerRepository extends JpaRepository <Customer, Integer> {
}
