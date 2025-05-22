package ss5_static_accessmodifier.bai_tap.quan_li_san_pham;

import java.util.Scanner;

public class ProductManagement {
    public static void DisplayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int SEARCH = 5;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-----Chọn chức năng-----\n"
                    + "1.Hiển thị danh sách sản phầm\n"
                    + "2.Thêm mới sản phẩm\n"
                    + "3.Cập nhật sản phẩm\n"
                    + "4.Xóa sản phẩm\n"
                    + "5.Tìm kiếm sản phẩm\n"
                    + "6.Thoát chương trình\n");
            System.out.println("Chọn chức năng bạn muốn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case DISPLAY:
                    displayProduct();
                    break;
                case ADD:
                    addProduct();
                    break;
                case UPDATE:
                    updateProduct();
                    break;
                case DELETE:
                    deleteProduct();
                    break;
                case SEARCH:
                    searchProduct();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }

    private static Product[] products = new Product[5]; // Đã khởi tạo sẵn 5 sản phẩm

    static {
        products[0] = new Product("Iphone 16", 16000);
        products[1] = new Product("Iphone 16 Plus", 18000);
        products[2] = new Product("Iphone 16 Pro", 20000);
        products[3] = new Product("Iphone 16 Promax", 25000);
        products[4] = new Product("Iphone 17", 30000);
    }

    public static void displayProduct() {
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID: " + products[i].getId() + ", Tên: " + products[i].getName() + ", Giá: " + products[i].getPrice() + " VND");
        }
    }

    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product newProduct = new Product(name, price);

        Product[] newArray = new Product[Product.count];
        for (int i = 0; i < products.length; i++) {
            newArray[i] = products[i];
        }
        newArray[Product.count - 1] = newProduct;
        products = newArray;

        System.out.println("Đã thêm sản phẩm có ID: " + newProduct.getId());
    }

    public static void updateProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ID sản phẩm muốn cập nhật: ");
        int id = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                found = true;
                boolean flag = true;
                while (flag) {
                    System.out.println("-----Chọn dữ liệu cần cập nhật-----\n"
                            + "1.Tên sản phẩm\n"
                            + "2.Giá sản phẩm\n"
                            + "3.Tên và giá sản phẩm\n"
                            + "4.Thoát \n");
                    System.out.println("Chọn chức năng bạn muốn: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Tên mới của sản phẩm: ");
                            String name = scanner.nextLine();
                            products[i].setName(name);
                            break;
                        case 2:
                            System.out.println("Giấ mới của sản phẩm: ");
                            double price = scanner.nextDouble();
                            scanner.nextLine();
                            products[i].setPrice(price);
                            break;
                        case 3:
                            System.out.println("Tên mới của sản phẩm: ");
                            String newName = scanner.nextLine();
                            products[i].setName(newName);
                            System.out.println("Giấ mới của sản phẩm: ");
                            double newPrice = scanner.nextDouble();
                            products[i].setPrice(newPrice);
                            break;
                        case 4:
                            flag = false;
                            System.out.println("Thoát cập nhật");
                            break;
                        default:
                            break;
                    }
                }
                break;
            }
        }
        if(!found) {
            System.out.println("Sản phẩm không tồn tại");
        }
        displayProduct();
    }
    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ID sản phẩm muốn xóa: ");
        int id = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == id) {
                found = true;
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length - 1] = null;
                System.out.println("Đã xóa sản phẩm có ID: " + id);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có ID: " + id);
        }

        displayProduct();
    }
    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm càn tìm: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            // equalIgnoreCase không phân biệt chữ hoa chũ thường
            if(products[i].getName().equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Sản phẩm cần tìm là: " + products[i].getName() + " Giá " + products[i].getPrice());
            }
        }

        if (!found) {
            System.out.println("Sản phẩm không tồn tại");
        }
    }
}

