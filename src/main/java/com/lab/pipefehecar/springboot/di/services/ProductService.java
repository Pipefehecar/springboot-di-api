package com.lab.pipefehecar.springboot.di.services;

import com.lab.pipefehecar.springboot.di.models.Product;
import com.lab.pipefehecar.springboot.di.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private final ProductRepository repository = new ProductRepository();

    public List<Product> getAll(){

        return repository.getAll().stream().map(p ->{
            double newPrice = p.getPrice() * 1.25d;
            Product newProduct = (Product) p.clone();
            newProduct.setPrice((long)newPrice);
            return newProduct;
        }).collect(Collectors.toList());
    }
    public Product getById(Long id){
        return repository.getById(id);
    }
}
