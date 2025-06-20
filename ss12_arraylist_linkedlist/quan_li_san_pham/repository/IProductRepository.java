package ss12_arraylist_linkedlist.quan_li_san_pham.repository;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;
import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    void add(Product product);
    Optional<Product> findById(int id);
    void update(Product product);
    void delete(int id);
    List<Product> findAll();
    List<Product> searchByName(String keyword);
    List<Product> sortByPrice(boolean ascending);
}
