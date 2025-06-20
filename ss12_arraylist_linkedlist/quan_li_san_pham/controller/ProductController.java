package ss12_arraylist_linkedlist.quan_li_san_pham.controller;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;
import ss12_arraylist_linkedlist.quan_li_san_pham.service.ProductService;

import java.util.List;

public class ProductController {
    private final ProductService service = new ProductService();

    public void createProduct(int id, String name, double price) {
        Product product = new Product(id, name, price);
        service.addProduct(product);
    }

    public void updateProduct(int id, String name, double price) {
        Product product = new Product(id, name, price);
        service.updateProduct(product);
    }

    public void deleteProduct(int id) {
        service.deleteProduct(id);
    }

    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    public List<Product> searchByName(String keyword) {
        return service.searchByName(keyword);
    }

    public List<Product> sortProducts(boolean ascending) {
        return service.sortByPrice(ascending);
    }

    public Product findById(int id) {
        return service.findById(id);
    }
}
