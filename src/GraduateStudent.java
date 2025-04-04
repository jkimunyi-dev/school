public class GraduateStudent extends Student {
    private String researchTopic;
    private Lecturer supervisor;

    public GraduateStudent(String id, String name, String email, String phone, String studentId, 
                          String researchTopic, Lecturer supervisor) {
        super(id, name, email, phone, studentId);
        this.researchTopic = researchTopic;
        this.supervisor = supervisor;
    }

    @Override
    public void printCourseDetails() {
        super.printCourseDetails();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Supervisor: " + supervisor.getName());
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public Lecturer getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Lecturer supervisor) {
        this.supervisor = supervisor;
    }
}