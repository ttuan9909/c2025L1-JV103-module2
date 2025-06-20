package ss12_arraylist_linkedlist.quan_li_san_pham.controller;

import ss12_arraylist_linkedlist.quan_li_san_pham.repository.IProductRepository;
import ss12_arraylist_linkedlist.quan_li_san_pham.repository.ProductRepository;
import ss12_arraylist_linkedlist.quan_li_san_pham.service.ProductService;
import ss12_arraylist_linkedlist.quan_li_san_pham.view.ProductView;

public class Main {
    public static void main(String[] args) {
        IProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        // Load dữ liệu từ file CSV khi khởi động
        ((ProductRepository) repository).loadFromFile();

        // Giao diện chính (hiển thị menu)
        ProductView view = new ProductView();
        view.showMenu();

        // Lưu dữ liệu vào file CSV khi thoát
        ((ProductRepository) repository).saveToFile();
    }
}
