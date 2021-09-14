package br.ufrn.ycodify.itemservice.models.services;

import br.ufrn.ycodify.itemservice.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id);
}
