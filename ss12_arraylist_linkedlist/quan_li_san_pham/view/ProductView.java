package ss12_arraylist_linkedlist.quan_li_san_pham.view;

import ss12_arraylist_linkedlist.quan_li_san_pham.controller.ProductController;
import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final ProductController controller = new ProductController();
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("\n----- Product Management -----");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product by ID");
            System.out.println("3. Delete Product by ID");
            System.out.println("4. Display Product List");
            System.out.println("5. Search Product by Name");
            System.out.println("6. Sort by Price (Asc)");
            System.out.println("7. Sort by Price (Desc)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> editProduct();
                case 3 -> deleteProduct();
                case 4 -> showAll();
                case 5 -> searchByName();
                case 6 -> sortByPrice(true);
                case 7 -> sortByPrice(false);
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        controller.createProduct(id, name, price);
        System.out.println("Product added.");
    }

    private void editProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product existing = controller.findById(id);
        if (existing == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        controller.updateProduct(id, name, price);
        System.out.println("Product updated.");
    }

    private void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        controller.deleteProduct(id);
        System.out.println("Product deleted.");
    }

    private void showAll() {
        List<Product> products = controller.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products.");
            return;
        }
        products.forEach(System.out::println);
    }

    private void searchByName() {
        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();
        List<Product> results = controller.searchByName(keyword);
        if (results.isEmpty()) {
            System.out.println("No matching products.");
            return;
        }
        results.forEach(System.out::println);
    }

    private void sortByPrice(boolean asc) {
        List<Product> sorted = controller.sortProducts(asc);
        sorted.forEach(System.out::println);
    }
}
