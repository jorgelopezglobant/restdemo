package com.restexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Data
@Entity
public class Hardware {
    @Id
    @GeneratedValue
    private int idHardware;
    private String name;
    private float price;
}
