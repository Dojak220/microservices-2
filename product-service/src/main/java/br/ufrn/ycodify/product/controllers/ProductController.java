package br.ufrn.ycodify.product.controllers;

import br.ufrn.ycodify.product.models.entities.Product;
import br.ufrn.ycodify.product.models.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/product")
    public List<Product> products() {
        return iProductService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product productDetail(@PathVariable Long id) {
        return iProductService.findById(id);
    }
}
