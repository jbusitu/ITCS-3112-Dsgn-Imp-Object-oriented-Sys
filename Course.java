public class Course {
    private String courseCode;
    private String title;
    private String description;
    private String instructorDetails;

    //Constructor
    public Course(String courseCode, String title, String description, String instructorDetails) {
            this.courseCode = courseCode;
            this.title = title;
            this.description = description;
            this.instructorDetails = instructorDetails;
        }

    //Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }

    public String geTtitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getInstructorDetails() {
        return instructorDetails;
    }
    
    //Override toString() for better representation
    @Override
    public String toString() {
        return "Course code: " + courseCode + ", Title: " + title + ", Description: " + description + ", Instructor: " + instructorDetails; 
    }

}