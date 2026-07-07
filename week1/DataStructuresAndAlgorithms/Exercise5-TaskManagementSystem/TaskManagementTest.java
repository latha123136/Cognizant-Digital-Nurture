public class TaskManagementTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(101, "Design Database", "Pending");
        taskList.addTask(102, "Develop Login Module", "In Progress");
        taskList.addTask(103, "Testing", "Pending");

        System.out.println("All Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching Task 102:");
        taskList.searchTask(102);

        System.out.println("\nDeleting Task 101:");
        taskList.deleteTask(101);

        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();

    }

}