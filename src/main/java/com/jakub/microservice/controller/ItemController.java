package com.jakub.microservice.controller;

import java.util.List;

import com.jakub.microservice.service.ItemService;
import com.jakub.microservice.model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.*;

@RestController
class ItemController {

    @Autowired
    private ItemService itemService;

    public void itemService(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/list")
    public List<Item> all() {
        return itemService.retrieveItems();
    }

    @PostMapping("/add")
    public Item newItem(@Valid @RequestBody Item newItem) {
        return itemService.saveItem(newItem);
    }
}
