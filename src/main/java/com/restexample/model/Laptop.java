package com.restexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by jorge.lopez on 5/4/2017.
 */
@Data
@Entity
public class Laptop implements Repairable{
    @Id
    @GeneratedValue
    private int idLaptop;
    private String brand;
    private String model;

    @Override
    public List<InvoiceDetail> getClinicalRecord() {
        return null;
    }
}
