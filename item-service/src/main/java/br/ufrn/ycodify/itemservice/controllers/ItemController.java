package br.ufrn.ycodify.itemservice.controllers;

import br.ufrn.ycodify.itemservice.models.Item;
import br.ufrn.ycodify.itemservice.models.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> items() {
        return itemService.findAll();
    }

    @GetMapping("/items/{id}/quantity/{quantity}")
    public Item itemDetails(@PathVariable Long id, @PathVariable Integer quantity) {
        return itemService.findById(id, quantity);
    }
}
