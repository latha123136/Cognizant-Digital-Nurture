public class EmployeeManagementTest {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Rahul", "Developer", 65000));

        management.addEmployee(new Employee(102, "Anjali", "Tester", 50000));

        management.addEmployee(new Employee(103, "Kiran", "Manager", 90000));

        management.displayEmployees();

        System.out.println("\nSearching Employee 102:");

        Employee employee = management.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Employee Not Found");

        System.out.println();

        management.deleteEmployee(102);

        management.displayEmployees();

    }

}