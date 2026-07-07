import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        Product product = products.get(id);

        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (products.remove(id) != null)
            System.out.println("Product deleted successfully.");
        else
            System.out.println("Product not found.");
    }

    // Display Inventory
    public void displayProducts() {

        System.out.println("\nInventory:");

        for (Product product : products.values()) {
            System.out.println(product);
        }

    }
}