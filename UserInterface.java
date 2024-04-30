import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private List<Student> students;
    private List<Course> courses;
    private Map<Student, Enrollment> studentEnrollments;

    //constructor
    public UserInterface() {
        scanner = new Scanner(System.in);
        students = new ArrayList<>();
        courses = new ArrayList<>();
        studentEnrollments = new HashMap<>();
    }

    //Method to add a student
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Contact Information: ");
        String contactInfo = scanner.nextLine();
        System.out.print("Enter Enrollment Details: ");
        String enrollmentDetails = scanner.nextLine();

        Student student = new Student(studentID, name, contactInfo, enrollmentDetails);
        students.add(student);
        studentEnrollments.put(student, new Enrollment(student));
    }

    //Method to display all students
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //Method to add a course
    public void addCourse() {
        System.out.println();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter Course Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Course Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Instructor Details: ");
        String instructorDetails = scanner.nextLine();

        Course course = new Course(courseCode, title, description, instructorDetails);
        courses.add(course);
    }

    //Method to display all courses
    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    //Method to add a course grade for a student
    public void addCourseGrade(int studentId, String courseCode, double grade) {
        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);

        if (student == null || course == null) {
            System.out.println("Student or Course not found!");
            return;
        }

        Enrollment enrollment = studentEnrollments.get(student);

        if (!enrollment.isEnrolledInCourse(course)) {
            System.out.println("Student is not enrolled in this course!");
            return;
        }

        AcademicRecord academicRecord = student.getAcademicRecord();
        academicRecord.addCourseGrade(courseCode, grade);
        System.out.println("Grade added successfully!");
    }

    //Method to enroll a student in a course
    public void enrollStudentInCourse() {
        System.out.println();
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);

        if (student == null || course == null) {
            System.out.println("Student or Course not found!");
            return;
        }

        Enrollment enrollment = studentEnrollments.get(student);

        if (enrollment.isEnrolledInCourse(course)) {
            System.out.println("Student is already enrolled in this course!");
        } else {
            enrollment.enrollInCourse(course);
            System.out.println("Student enrolled successfully!");
        }
    }

    public double calculateGPA(int studentId) {
        Student student = findStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found!");
            return 0.0;
        }

        AcademicRecord academicRecord = student.getAcademicRecord();
        return academicRecord.calculateGPA();
    }

    //Helper method to find a student by Id
    private Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) { 
                return student;
            }
        }
        return null;
    }

    //Helper method to find a course by code
    private Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
}