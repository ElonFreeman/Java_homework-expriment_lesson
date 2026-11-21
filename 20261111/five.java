public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product(1001, "mouse", 69.0);
        products[1] = new Product(1002, "keyboard", 129.0);
        products[2] = new Product(1003, "erji", 199.0);
        products[3] = new Product(1004, "Udisk", 79.0);

        Product.find(products, 1002);
        Product.find(products, "erji");
        Product.find(products, 100.0);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void find(Product[] products, int id) {
        for (Product p : products) {
            if (p.id == id) {
                System.out.println(p.name + " " + p.price);
            }
        }
    }

    public static void find(Product[] products, String name) {
        for (Product p : products) {
            if (p.name.equals(name)) {
                System.out.println(p.name + " " + p.price);
            }
        }
    }

    public static void find(Product[] products, double maxPrice) {
        for (Product p : products) {
            if (p.price <= maxPrice) {
                System.out.println(p.name + " " + p.price);
            }
        }
    }
}
