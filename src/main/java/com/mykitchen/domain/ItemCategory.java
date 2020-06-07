package com.mykitchen.domain;

import javax.annotation.Generated;
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
@Table(name = "item_category", schema = DbConstants.TRANSACTION_SCHEMA)
public class ItemCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_category_id")
    private Integer itemCategoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "item_type")
    private String itemType;
}