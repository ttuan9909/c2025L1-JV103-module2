package ss17_binary_file_serialization.product_management.controller;

import ss17_binary_file_serialization.product_management.entity.Product;
import ss17_binary_file_serialization.product_management.service.IProductService;
import ss17_binary_file_serialization.product_management.service.ProductService;

import java.util.List;

public class ProductController {
    private IProductService service = new ProductService();

    public void addProduct(Product product) {
        service.add(product);
    }

    public List<Product> getAllProducts() {
        return service.display();
    }

    public List<Product> searchProducts(String name) {
        return service.search(name);
    }
}
