public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 50000));
        inventory.addProduct(new Product(102, "Mouse", 20, 700));
        inventory.addProduct(new Product(103, "Keyboard", 15, 1200));

        System.out.println("\nInventory:");

        inventory.displayProducts();

        inventory.updateProduct(102, 50);

        System.out.println("\nAfter Update:");

        inventory.displayProducts();

        inventory.deleteProduct(101);

        System.out.println("\nAfter Delete:");

        inventory.displayProducts();
    }
}