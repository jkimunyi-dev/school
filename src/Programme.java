// Programme.java
import java.util.ArrayList;
import java.util.List;

public class Programme {
    private String programmeCode;
    private String programmeName;
    private List<Course> courses;

    public Programme(String programmeCode, String programmeName) {
        this.programmeCode = programmeCode;
        this.programmeName = programmeName;
        this.courses = new ArrayList<>();
    }

    // Getters and Setters
    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.attachToProgramme(programmeName);
        }
    }

    @Override
    public String toString() {
        return "Programme Code: " + programmeCode + ", Name: " + programmeName;
    }

    public void printCourseDetails() {
        System.out.println("\nCourses in " + programmeName + " programme:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName() + " (Code: " + course.getCourseCode() + ")");
            if (course.getLecturer() != null) {
                System.out.println("  Lecturer: " + course.getLecturer().getName());
            } else {
                System.out.println("  Lecturer: Not assigned yet");
            }
        }
    }
}