package ss17_binary_file_serialization.product_management.service;

import ss17_binary_file_serialization.product_management.entity.Product;
import ss17_binary_file_serialization.product_management.repository.IProductRepository;
import ss17_binary_file_serialization.product_management.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository repository = new ProductRepository();

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public List<Product> display() {
        return repository.findAll();
    }

    @Override
    public List<Product> search(String name) {
        return repository.searchByName(name);
    }
}
