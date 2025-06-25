package ss17_binary_file_serialization.product_management.repository;

import ss17_binary_file_serialization.product_management.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE_PATH = "D:\\CODEGYM\\module2\\module2\\src\\ss17_binary_file_serialization\\product_management\\config\\product.dat";

    @Override
    public void add(Product product) {
        List<Product> products = findAll();
        products.add(product);
        writeToFile(products);
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return products;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Không thể đọc file: " + e.getMessage());
        }

        return products;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = findAll();
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    private void writeToFile(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
