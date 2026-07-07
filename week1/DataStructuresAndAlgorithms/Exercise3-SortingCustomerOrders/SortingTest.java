public class SortingTest {

    public static void printOrders(Order[] orders) {

        for (Order order : orders) {
            System.out.println(order);
        }

    }

    public static void main(String[] args) {

        Order[] bubbleOrders = {

                new Order(101, "Rahul", 5500),
                new Order(102, "Anjali", 2200),
                new Order(103, "Kiran", 9200),
                new Order(104, "Sneha", 4300)

        };

        System.out.println("Original Orders:");

        printOrders(bubbleOrders);

        BubbleSort.sort(bubbleOrders);

        System.out.println("\nAfter Bubble Sort:");

        printOrders(bubbleOrders);

        Order[] quickOrders = {

                new Order(101, "Rahul", 5500),
                new Order(102, "Anjali", 2200),
                new Order(103, "Kiran", 9200),
                new Order(104, "Sneha", 4300)

        };

        QuickSort.sort(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\nAfter Quick Sort:");

        printOrders(quickOrders);

    }

}