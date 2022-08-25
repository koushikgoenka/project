package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.model.Item;
import com.example.ordermanagementsystem.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping
    private Item addItem(@RequestBody Item item){
        return itemRepository.save(item);
    }

    @GetMapping("/{id}")
    private Optional<Item> getItemById(@PathVariable long id){
        return itemRepository.findById(id);
    }

}
