public abstract class AcademicMember extends Person {
    protected String department;
    
    public AcademicMember(String id, String name, String email, String phone, String department) {
        super(id, name, email, phone);
        this.department = department;
    }
    
    public abstract void printSchedule();
    public abstract double calculateWorkload();
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
}