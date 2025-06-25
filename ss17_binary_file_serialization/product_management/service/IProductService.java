package ss17_binary_file_serialization.product_management.service;

import ss17_binary_file_serialization.product_management.entity.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);
    List<Product> display();
    List<Product> search(String name);
}
