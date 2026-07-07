public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Keyboard", "Accessories"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Monitor", "Electronics"),
                new Product(104, "Mouse", "Accessories"),
                new Product(105, "Printer", "Office")

        };

        System.out.println("Linear Search:");

        Product result1 =
                SearchOperations.linearSearch(products, "Monitor");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 =
                SearchOperations.binarySearch(products, "Monitor");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found");

    }

}