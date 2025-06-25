package ss17_binary_file_serialization.product_management.repository;

import ss17_binary_file_serialization.product_management.entity.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);
    List<Product> findAll();
    List<Product> searchByName(String name);
}
