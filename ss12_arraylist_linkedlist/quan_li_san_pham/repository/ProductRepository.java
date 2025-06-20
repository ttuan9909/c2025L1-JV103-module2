package ss12_arraylist_linkedlist.quan_li_san_pham.repository;

import ss12_arraylist_linkedlist.quan_li_san_pham.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements IProductRepository {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
        saveToFile();
    }

    @Override
    public Optional<Product> findById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public void update(Product updatedProduct) {
        findById(updatedProduct.getId()).ifPresent(product -> {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            saveToFile();
        });
    }

    @Override
    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
        saveToFile();
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public List<Product> searchByName(String keyword) {
        keyword = keyword.toLowerCase();
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public List<Product> sortByPrice(boolean ascending) {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort((p1, p2) -> ascending ?
                Double.compare(p1.getPrice(), p2.getPrice()) :
                Double.compare(p2.getPrice(), p1.getPrice()));
        return sorted;
    }

    public void saveToFile() {
        File file = new File("D:\\CODEGYM\\module2\\module2\\src\\ss12_arraylist_linkedlist\\quan_li_san_pham\\products.csv");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (Product p : products) {
                writer.printf("%d,%s,%.2f%n", p.getId(), p.getName(), p.getPrice());
            }
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }


    public void loadFromFile() {
        products.clear();
        File file = new File("D:\\CODEGYM\\module2\\module2\\src\\ss12_arraylist_linkedlist\\quan_li_san_pham\\products.csv");
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    products.add(new Product(id, name, price));
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}