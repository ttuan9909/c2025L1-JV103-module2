package ss5_static_accessmodifier.bai_tap.quan_li_san_pham;

public class Product {
    private int id;
    private String name;
    private double price;
    public static int count = 0;
    private static int nextId = 1;

    public Product() {
        this.id = nextId++;
        count++;
    }

    public Product(String name, double price) {
        this.id = nextId++;  // ID tự động tăng
        this.name = name;
        this.price = price;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
