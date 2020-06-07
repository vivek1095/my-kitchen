package com.mykitchen.repository;

import com.mykitchen.domain.ItemCategory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategoryRepository extends CrudRepository<ItemCategory, Integer> {

}