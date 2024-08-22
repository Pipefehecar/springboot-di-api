package com.lab.pipefehecar.springboot.di.repositories;

import com.lab.pipefehecar.springboot.di.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product getById(Long id);
}
