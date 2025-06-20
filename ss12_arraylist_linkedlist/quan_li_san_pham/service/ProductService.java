package ss12_arraylist_linkedlist.quan_li_san_pham.service;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;
import ss12_arraylist_linkedlist.quan_li_san_pham.repository.IProductRepository;
import ss12_arraylist_linkedlist.quan_li_san_pham.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository repository;

    public ProductService() {
        this.repository = new ProductRepository(); // Có thể inject khác nếu cần
    }

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addProduct(Product product) {
        repository.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        repository.update(product);
    }

    @Override
    public void deleteProduct(int id) {
        repository.delete(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public List<Product> searchByName(String keyword) {
        return repository.searchByName(keyword);
    }

    @Override
    public List<Product> sortByPrice(boolean ascending) {
        return repository.sortByPrice(ascending);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }
}