package com.mykitchen.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mykitchen.constants.DbConstants;

import lombok.Data;

@Data
@Entity
@Table(name = "address", schema = DbConstants.TRANSACTION_SCHEMA)
public class Address implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1894869529921051088L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "address_line")
    private String addressLine;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "zipcode")
    private int zipcode;
}