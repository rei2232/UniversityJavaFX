package sample.model;

public class Teacher {
    private String TeacherNumber;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String[] Degrees;
    private Department department;
    private String DepartmentCode;
    private TeacherStatus teacherStatus;
    private String TeacherStatusCode;
    private String Notes;

    public String getTeacherNumber() {
        return TeacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        TeacherNumber = teacherNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String[] getDegrees() {
        return Degrees;
    }

    public void setDegrees(String[] degrees) {
        Degrees = degrees;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(Department department) {
        DepartmentCode = department.getDepartmentcode();
    }

    public String getTeacherStatusCode() {
        return TeacherStatusCode;
    }

    public void setTeacherStatusCode(TeacherStatus status) {
        TeacherStatusCode = getTeacherStatusCode();
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
