package com.mykitchen.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mykitchen.constants.DbConstants;

import lombok.Data;

@Data
@Entity
@Table(name = "customer", schema = DbConstants.TRANSACTION_SCHEMA)
public class Customer implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1894499503873959101L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile")
    private Integer mobile;

    @Column(name = "email")
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;

    public Customer() {
        // this is default constructor
    }

    public Customer(String firstName, String lastName, Integer mobile, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }
}