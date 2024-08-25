package com.lab.pipefehecar.springboot.di.services;

import com.lab.pipefehecar.springboot.di.models.Product;
import com.lab.pipefehecar.springboot.di.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(@Qualifier("OldProducts") ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAll(){
        return repository.getAll().stream().map(p ->{
            double newPrice = p.getPrice() * 1.25d;
//            Product newProduct = (Product) p.clone();
//            newProduct.setPrice((long)newPrice);
            p.setPrice((long) newPrice);
            return p;
        }).collect(Collectors.toList());
    }

    @Override
    public Product getById(Long id){
        return repository.getById(id);
    }
}
