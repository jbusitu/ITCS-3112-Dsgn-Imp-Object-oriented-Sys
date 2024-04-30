import java.util.HashMap;
import java.util.Map;

public class AcademicRecord {
    private Map<String, Double> grades;

    //constructor
    public AcademicRecord() {
        grades = new HashMap<>();
    }

    //Method to add a course grade
    public void addCourseGrade(String courseCode, double grade) {
        grades.put(courseCode, grade);
    }

    //Method to get the GPA based on grades
    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double totalGradePoints = 0.0;
        int totalCourses = grades.size();

        for (double grade : grades.values()) {
            totalGradePoints +=grade;
        }

        return totalGradePoints / totalCourses;
    }
}