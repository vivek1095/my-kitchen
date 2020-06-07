package com.mykitchen.service;

import java.util.List;
import java.util.Optional;

import com.mykitchen.domain.ItemCategory;
import com.mykitchen.repository.ItemCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryService {

    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    public List<ItemCategory> getAllItemCategory() {
        List<ItemCategory> itemCategories = null;

        itemCategories = (List<ItemCategory>) itemCategoryRepository.findAll();

        return itemCategories;
    }

    public void addItemCategory(ItemCategory itemCategory) {
        itemCategoryRepository.save(itemCategory);
    }

    public long getItemCategoryCount() {
        return itemCategoryRepository.count();
    }

    public void deleteItemCategory(ItemCategory itemCategory) {
        itemCategoryRepository.delete(itemCategory);
    }

    public void deleteItemCategoryById(Integer itemCategoryId) {
        itemCategoryRepository.deleteById(itemCategoryId);
    }

    public Optional<ItemCategory> getItemCategoryById(Integer itemCategoryId) {
        return itemCategoryRepository.findById(itemCategoryId);
    }
}