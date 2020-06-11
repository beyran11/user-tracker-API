package com.inftech.userapi.service;

import com.inftech.userapi.entity.Item;
import com.inftech.userapi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAll() {

        return itemRepository.findAll();
    }

}