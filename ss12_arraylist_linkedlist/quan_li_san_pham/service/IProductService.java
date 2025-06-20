package ss12_arraylist_linkedlist.quan_li_san_pham.service;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
    List<Product> searchByName(String keyword);
    List<Product> sortByPrice(boolean ascending);
    Product findById(int id);
}
