package com.lab.pipefehecar.springboot.di.repositories;

import com.lab.pipefehecar.springboot.di.models.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Keyboard Razer", 190000L),
                new Product(2L, "Mouse Logitech G305", 250000L),
                new Product(3L, "WebCam Logitech 1080P", 105000L),
                new Product(4L, "SSD Kingston 4TB", 355000L)
        );
    }

    @Override
    public List<Product> getAll() {
        return data;
    }

    @Override
    public Product getById(Long id) {
      return data.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }
}
