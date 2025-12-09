package com.pluralsight.NorthwindTradersSpringBoot.data;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ProductDaoInMemory implements ProductDao {


    @Override
    public Product add(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }
}
