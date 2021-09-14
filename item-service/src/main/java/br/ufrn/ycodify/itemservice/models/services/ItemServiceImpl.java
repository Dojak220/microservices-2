package br.ufrn.ycodify.itemservice.models.services;

import br.ufrn.ycodify.itemservice.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Long id) {
        return null;
    }
}
