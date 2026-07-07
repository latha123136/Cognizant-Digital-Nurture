public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newTask;
    }

    // Display Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Found.");
            return;
        }

        Task current = head;

        while (current != null) {
            System.out.println(current);
            current = current.next;
        }

    }

    // Search Task
    public void searchTask(int id) {

        Task current = head;

        while (current != null) {

            if (current.taskId == id) {
                System.out.println("Task Found:");
                System.out.println(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Task Not Found.");
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task current = head;

        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task Deleted Successfully.");
        } else {
            System.out.println("Task Not Found.");
        }

    }

}