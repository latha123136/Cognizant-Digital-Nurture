public class MVCPatternTest {

    public static void main(String[] args) {

        Student model = new Student(
                "Rahul",
                101,
                "A"
        );

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        System.out.println("Original Details:");

        controller.updateView();

        controller.setStudentName("Priya");
        controller.setStudentGrade("A+");

        System.out.println();

        System.out.println("Updated Details:");

        controller.updateView();
    }
}