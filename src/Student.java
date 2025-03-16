// Student.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private String studentId;
    private List<Course> enrolledCourses;
    private Map<Course, Double> scores;
    private String programme;

    public Student(String id, String name, String email, String phone, String studentId) {
        super(id, name, email, phone);
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
        this.scores = new HashMap<>();
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            System.out.println(getName() + " enrolled in " + course.getCourseName());
        } else {
            System.out.println(getName() + " is already enrolled in " + course.getCourseName());
        }
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getProgramme() {
        return programme;
    }

    public void assignScore(Course course, double score) {
        if (enrolledCourses.contains(course)) {
            scores.put(course, score);
            System.out.println("Score " + score + " assigned to " + getName() + " for " + course.getCourseName());
        } else {
            System.out.println("Cannot assign score. " + getName() + " is not enrolled in " + course.getCourseName());
        }
    }

    public Double getScore(Course course) {
        return scores.get(course);
    }

    public Map<Course, Double> getAllScores() {
        return scores;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Programme: " + programme;
    }

    public void printCourseDetails() {
        System.out.println("\nCourses enrolled by " + getName() + ":");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName() + " (Code: " + course.getCourseCode() + ")");
            Double score = scores.get(course);
            if (score != null) {
                System.out.println("  Score: " + score);
            } else {
                System.out.println("  Score: Not assigned yet");
            }
        }
    }
}