public class LibraryManagementTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Algorithms", "Thomas Cormen"),
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(103, "Database Systems", "Korth"),
                new Book(104, "Java Programming", "Herbert Schildt"),
                new Book(105, "Operating Systems", "Galvin")

        };

        System.out.println("Linear Search:");

        Book result1 = SearchLibrary.linearSearch(books, "Java Programming");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Book Not Found");

        System.out.println();

        System.out.println("Binary Search:");

        Book result2 = SearchLibrary.binarySearch(books, "Java Programming");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Book Not Found");
    }
}