import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product Added Successfully.");
    }

    // Display Products
    public void displayProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Update Product
    public void updateProduct(int id, int quantity) {
        for (Product p : products) {
            if (p.productId == id) {
                p.quantity = quantity;
                System.out.println("Product Updated.");
                return;
            }
        }
        System.out.println("Product Not Found.");
    }

    // Delete Product
    public void deleteProduct(int id) {
        for (Product p : products) {
            if (p.productId == id) {
                products.remove(p);
                System.out.println("Product Deleted.");
                return;
            }
        }
        System.out.println("Product Not Found.");
    }
}