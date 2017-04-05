package com.restexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jorge.lopez on 4/4/2017.
 */
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    private int idCustomer;
    private String name;
    private String surname;
    private String dni;

}
