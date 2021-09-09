package br.ufrn.ycodify.product.models.services;

import br.ufrn.ycodify.product.models.entities.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll();
    public Product findById(Long Id);
}
