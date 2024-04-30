public class Student { 
    private int studentId;
    private String name;
    private String contactInfo;
    private String enrollmentDetails;
    private AcademicRecord academicRecord;

    //Constructor
    public Student(int studentId, String name, String contactInfo, String enrollmentDetails) {
        this.studentId = studentId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.enrollmentDetails = enrollmentDetails;
        this.academicRecord = new AcademicRecord();
    }

    //Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getEnrollmentDetails() {
        return enrollmentDetails;
    }

    public AcademicRecord getAcademicRecord() {
        return academicRecord;
    }

    public void setAcademicRecord(AcademicRecord academicRecord) {
        this.academicRecord = academicRecord;
    }

    //Override toString() for better representation
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Contact: " + contactInfo + ", Enrollment: " + enrollmentDetails; 
    }
}