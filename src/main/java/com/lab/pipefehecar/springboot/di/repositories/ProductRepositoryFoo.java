package com.lab.pipefehecar.springboot.di.repositories;

import com.lab.pipefehecar.springboot.di.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Primary
@Repository("FooProducts")
public class ProductRepositoryFoo implements ProductRepository {


    @Override
    public List<Product> getAll() {
        return Collections.singletonList(new Product(1L, "Asus Monitor 27\" 2K ", 1332000L));
    }


    @Override
    public Product getById(Long id) {
        return new Product(1L, "Asus Monitor 27\" 2K ", 1332000L);
    }
}
