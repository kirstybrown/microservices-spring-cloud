package com.kirstybrown.microserviciosspringcloud.item.models;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer quantity);
}
