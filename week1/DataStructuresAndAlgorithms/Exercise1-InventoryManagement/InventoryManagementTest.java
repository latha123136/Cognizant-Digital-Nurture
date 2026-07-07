public class InventoryManagementTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(
                new Product(101, "Laptop", 10, 65000));

        inventory.addProduct(
                new Product(102, "Keyboard", 25, 1200));

        inventory.addProduct(
                new Product(103, "Mouse", 30, 800));

        inventory.displayProducts();

        inventory.updateProduct(
                102,
                "Mechanical Keyboard",
                20,
                2500);

        inventory.displayProducts();

        inventory.deleteProduct(103);

        inventory.displayProducts();

    }

}