
// Lecturer.java
import java.util.ArrayList;
import java.util.List;

public class Lecturer extends AcademicMember {
    private String lecturerId;
    private List<Course> assignedCourses;

    public Lecturer(String id, String name, String email, String phone, String lecturerId, String department) {
        super(id, name, email, phone, department);
        this.lecturerId = lecturerId;
        this.assignedCourses = new ArrayList<>();
    }

    // Getters and Setters
    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            course.setLecturer(this);
            System.out.println(getName() + " assigned to teach " + course.getCourseName());
        } else {
            System.out.println(getName() + " is already assigned to teach " + course.getCourseName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Lecturer ID: " + lecturerId;
    }

    public void printAssignedCourses() {
        System.out.println("\nCourses assigned to " + getName() + ":");
        for (Course course : assignedCourses) {
            System.out.println("- " + course.getCourseName() + " (Code: " + course.getCourseCode() + ")");
        }
    }

    @Override
    public void printSchedule() {
        System.out.println("\nTeaching Schedule for " + getName() + ":");
        for (Course course : assignedCourses) {
            System.out.println("- " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
    }

    @Override
    public double calculateWorkload() {
        return assignedCourses.stream()
                .mapToDouble(Course::getCredits)
                .sum() * 2.5; // Assuming 2.5 hours of work per credit
    }
}
