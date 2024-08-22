package com.lab.pipefehecar.springboot.di.services;

import com.lab.pipefehecar.springboot.di.models.Product;

import java.util.List;

public interface ProductService {
    Product getById(Long id);
    List<Product> getAll();
}
