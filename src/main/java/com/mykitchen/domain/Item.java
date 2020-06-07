package com.mykitchen.domain;

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
@Table(name = "item", schema = DbConstants.TRANSACTION_SCHEMA)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "name")
    private String itemName;

    @Column(name = "price")
    private float price;

    @ManyToOne
    private ItemCategory itemCategory;

}