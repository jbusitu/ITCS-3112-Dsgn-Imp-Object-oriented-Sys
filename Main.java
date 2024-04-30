public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        //Sample code to demonstrate the system
        userInterface.addStudent();
        userInterface.addCourse();
        userInterface.enrollStudentInCourse();

        System.out.println("\nAll Students:");
        userInterface.displayStudents();

        System.out.println("\nAll Courses:");
        userInterface.displayCourses();

        userInterface.addCourseGrade(101, "CS101", 4.0);
        double gpa = userInterface.calculateGPA(101);
        System.out.println("\nStudent GPA: " + gpa);
    }
}