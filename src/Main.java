// Main.java
public class Main {
    public static void main(String[] args) {
        // Create lecturers
        Lecturer lecturer1 = new Lecturer("L001", "Dr. John Smith", "john.smith@university.edu", "123-456-7890", "LECT001", "Computer Science");
        Lecturer lecturer2 = new Lecturer("L002", "Prof. Jane Doe", "jane.doe@university.edu", "987-654-3210", "LECT002", "Mathematics");

        // Create courses
        Course programmingCourse = new Course("CS101", "Introduction to Programming", 4);
        Course databaseCourse = new Course("CS202", "Database Systems", 3);
        Course calculusCourse = new Course("MATH101", "Calculus I", 4);
        Course statisticsCourse = new Course("MATH202", "Statistics", 3);

        // Create programmes
        Programme computerScience = new Programme("CS", "Computer Science");
        Programme dataScience = new Programme("DS", "Data Science");

        // Attach courses to programmes
        computerScience.addCourse(programmingCourse);
        computerScience.addCourse(databaseCourse);
        dataScience.addCourse(databaseCourse);
        dataScience.addCourse(calculusCourse);
        dataScience.addCourse(statisticsCourse);

        // Assign lecturers to courses
        lecturer1.assignCourse(programmingCourse);
        lecturer1.assignCourse(databaseCourse);
        lecturer2.assignCourse(calculusCourse);
        lecturer2.assignCourse(statisticsCourse);

        // Create students
        Student student1 = new Student("S001", "Alice Johnson", "alice.johnson@university.edu", "111-222-3333", "STU001");
        student1.setProgramme("Computer Science");
        Student student2 = new Student("S002", "Bob Williams", "bob.williams@university.edu", "444-555-6666", "STU002");
        student2.setProgramme("Data Science");

        // Enroll students in courses
        student1.enrollCourse(programmingCourse);
        student1.enrollCourse(databaseCourse);
        student1.enrollCourse(calculusCourse);
        programmingCourse.addStudent(student1);
        databaseCourse.addStudent(student1);
        calculusCourse.addStudent(student1);

        student2.enrollCourse(programmingCourse);
        student2.enrollCourse(databaseCourse);
        student2.enrollCourse(statisticsCourse);
        programmingCourse.addStudent(student2);
        databaseCourse.addStudent(student2);
        statisticsCourse.addStudent(student2);

        // Assign scores
        student1.assignScore(programmingCourse, 85.5);
        student1.assignScore(databaseCourse, 92.0);
        student1.assignScore(calculusCourse, 78.0);

        student2.assignScore(programmingCourse, 90.0);
        student2.assignScore(databaseCourse, 88.5);
        student2.assignScore(statisticsCourse, 95.0);

        // Print details
        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.println("\n----- PROGRAMMES -----");
        System.out.println(computerScience);
        computerScience.printCourseDetails();
        System.out.println("\n" + dataScience);
        dataScience.printCourseDetails();

        System.out.println("\n----- LECTURERS -----");
        System.out.println(lecturer1);
        lecturer1.printAssignedCourses();
        System.out.println("\n" + lecturer2);
        lecturer2.printAssignedCourses();

        System.out.println("\n----- STUDENTS -----");
        System.out.println(student1);
        student1.printCourseDetails();
        System.out.println("\n" + student2);
        student2.printCourseDetails();

        System.out.println("\n----- COURSES -----");
        System.out.println(programmingCourse);
        programmingCourse.printStudentDetails();
    }
}