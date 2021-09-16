package br.ufrn.ycodify.itemservice.models.services;

import br.ufrn.ycodify.itemservice.models.Item;
import br.ufrn.ycodify.itemservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<Item> findAll() {

        List<Product> products = Arrays.asList(Objects.requireNonNull(clientRest.getForObject("localhost:8001/products", Product[].class)));

        return products.stream().map(product -> new Item(product, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", id.toString());

        Product product = clientRest.getForObject("localhost:8001/products/{id}", Product.class, pathVariables);

        return new Item(product, quantity);

    }
}
