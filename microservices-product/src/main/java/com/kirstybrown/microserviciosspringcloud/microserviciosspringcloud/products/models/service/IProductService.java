package com.kirstybrown.microserviciosspringcloud.microserviciosspringcloud.products.models.service;

import com.kirstybrown.microserviciosspringcloud.microserviciosspringcloud.products.models.entity.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll();
    public Product findById(Long id);

}
