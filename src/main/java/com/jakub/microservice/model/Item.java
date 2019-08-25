package com.jakub.microservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Item {

    private @Id @GeneratedValue Long id;

    @NotEmpty(message = "Please provide a name")
    private String name;

    Item() {}

    Item(String name) {
        this.name = name;
    }
}
