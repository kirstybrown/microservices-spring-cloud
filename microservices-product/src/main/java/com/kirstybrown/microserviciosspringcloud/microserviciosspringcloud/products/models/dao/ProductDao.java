package com.kirstybrown.microserviciosspringcloud.microserviciosspringcloud.products.models.dao;

import com.kirstybrown.microserviciosspringcloud.microserviciosspringcloud.products.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
