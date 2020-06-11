package com.inftech.userapi.controller;

import com.inftech.userapi.entity.Item;
import com.inftech.userapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    // main page of localhost:8080
    @GetMapping("/")
    public List<Item> items() {

        return itemService.findAll();

    }



}
