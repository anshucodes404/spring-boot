package com.codes.webApp.service;

import com.codes.webApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    public List<Product> products = new ArrayList<>(List.of(new Product(1, "Laptop", 999.99),
            new Product(2, "Smartphone", 499.99),
            new Product(3, "Headphones", 199.99)));

    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(new Product(-1, "No item", -1.0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int idx = 0;
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == prod.getId()) {
                idx = i;
                break;
            }
        }
        products.set(idx, prod);
    }

    public void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
