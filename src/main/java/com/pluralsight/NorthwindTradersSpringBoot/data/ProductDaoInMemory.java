package com.pluralsight.NorthwindTradersSpringBoot.data;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class ProductDaoInMemory implements ProductDao {
    private List<Product> products;

    private int productId = 1;


    public ProductDaoInMemory() {
        this.products = new ArrayList<>();
    }

    @Override
    public List<Product> getAll() {
        products.add(new Product(1, 1, 999.99, "Apple iPhone 15"));
        products.add(new Product(2, 2, 599.49, "Samsung 4K TV"));
        products.add(new Product(3, 3, 120.00, "Nike Running Shoes"));
        products.add(new Product(4, 4, 179.89, "HP OfficeJet Printer"));
        products.add(new Product(5, 1, 349.95, "Sony Noise-Cancelling Headphones"));
        return products;
    }

    @Override
    public Product add(Product product) {
        product.setProductId(productId++);
        products.add(product);
        return product;
    }
}
