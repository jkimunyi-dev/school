// Course.java
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private Lecturer lecturer;
    private List<Student> enrolledStudents;
    private List<String> programmes;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.enrolledStudents = new ArrayList<>();
        this.programmes = new ArrayList<>();
    }

    // Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void attachToProgramme(String programme) {
        if (!programmes.contains(programme)) {
            programmes.add(programme);
            System.out.println(courseName + " attached to programme: " + programme);
        } else {
            System.out.println(courseName + " is already attached to programme: " + programme);
        }
    }

    public List<String> getProgrammes() {
        return programmes;
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Name: " + courseName + ", Credits: " + credits;
    }

    public void printStudentDetails() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName() + " (ID: " + student.getStudentId() + ")");
        }
    }
}