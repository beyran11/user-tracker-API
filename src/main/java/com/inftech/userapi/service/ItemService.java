package com.inftech.userapi.service;

import com.inftech.userapi.entity.Item;
import com.inftech.userapi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    private List<Item> items = new ArrayList<>();

    public List<Item> findAllItems() {

        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);

        return items ;
    }

    public Optional<Item> getItem(int id) {
        return itemRepository.findById(id);
    }

    public void addItem(Item item) {
        itemRepository.save(item) ;
    }

    public void updateItem(int id,Item item) {
        itemRepository.save(item) ;
    }

    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }

}