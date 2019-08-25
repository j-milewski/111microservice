package com.jakub.microservice.service;

import com.jakub.microservice.repository.ItemRepository;
import com.jakub.microservice.model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private final ItemRepository repository;

    ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> retrieveItems() {
        List<Item> employees = repository.findAll();
        return employees;
    }

    public Item saveItem(Item item){
        return repository.save(item);
    }
}
