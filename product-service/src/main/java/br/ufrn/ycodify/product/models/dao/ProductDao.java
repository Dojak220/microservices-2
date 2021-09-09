package br.ufrn.ycodify.product.models.dao;

import br.ufrn.ycodify.product.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
