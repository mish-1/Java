import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equalsIgnoreCase(productName)) {
                products.remove(i);
                System.out.println(productName + " removed from cart.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    double calculateTotalCost() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    void displayCart() {
        System.out.println("Products in Cart:");
        for (Product p : products) {
            System.out.println("Name: " + p.name + " | Price: " + p.price);
        }
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }
}

public class shoppingcart{
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct("Mouse");

        cart.displayCart();
    }
}
