import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private Student student;
    private List<Course> enrolledCourses;

    //Constructor
    public Enrollment(Student student) {
        this.student = student;
        enrolledCourses = new ArrayList<>();
    }

    //Method to enroll a student in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    //Method to check if a student is enrolled in a course
    public boolean isEnrolledInCourse(Course course) {
        return enrolledCourses.contains(course);
    }

    //Method to get the list of enrolled courses
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}