package ss17_binary_file_serialization.product_management.view;

import ss17_binary_file_serialization.product_management.controller.ProductController;
import ss17_binary_file_serialization.product_management.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private ProductController controller = new ProductController();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("==== QUẢN LÝ SẢN PHẨM ====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    displayProducts();
                    break;
                case "3":
                    searchProduct();
                    break;
                case "4":
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, manufacturer, description);
        controller.addProduct(product);
        System.out.println("Thêm sản phẩm thành công.");
    }

    private void displayProducts() {
        List<Product> products = controller.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    private void searchProduct() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        List<Product> products = controller.searchProducts(name);
        if (products.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }
}
