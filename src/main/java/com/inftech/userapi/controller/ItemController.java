package com.inftech.userapi.controller;

import com.inftech.userapi.entity.Item;
import com.inftech.userapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    // main page of localhost:8080
    @RequestMapping("/items")
    public List<Item> items() {

        return itemService.findAllItems();

    }

    @RequestMapping("/items/{id}")
    public Optional<Item> getItem(@PathVariable int id) {
        return itemService.getItem(id);

    }

    @RequestMapping(method =RequestMethod.POST, value="/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/items/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable int id) {
        itemService.updateItem(id, item);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/items/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }




}
