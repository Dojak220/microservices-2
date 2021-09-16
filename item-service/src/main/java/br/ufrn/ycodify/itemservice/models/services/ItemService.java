package br.ufrn.ycodify.itemservice.models.services;

import br.ufrn.ycodify.itemservice.models.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAll();
    Item findById(Long id, Integer quantity);
}
