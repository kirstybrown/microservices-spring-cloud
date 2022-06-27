package com.kirstybrown.microserviciosspringcloud.item.controllers;

import com.kirstybrown.microserviciosspringcloud.item.models.Item;
import com.kirstybrown.microserviciosspringcloud.item.models.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public List<Item> list(){
        return itemService.findAll();
    }

    @GetMapping("/see/{id}/quantity/{quantity}")
    public Item detail(@PathVariable Long id, @PathVariable Integer quantity) {
        return itemService.findById(id, quantity);
    }
}
