package com.inftech.userapi.repository;

import com.inftech.userapi.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
