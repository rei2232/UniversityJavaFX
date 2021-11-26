package sample.model;

public class UndergraduateMajor {
    private int MajorID; // primary key
    private String Major;
    private Employee employee;
    private String Dean;
    private String Notes;

    public int getMajorID() {
        return MajorID;
    }

    public void setMajorID(int majorID) {
        MajorID = majorID;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getDean() {
        return Dean;
    }

    public void setDean(Employee employee) {
        Dean = employee.getEmployeeNumber();
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
