package sample.model;

public class Department {
    private String DepartmentCode;
    private String DepartmentName;
    private String Notes;


    public String getDepartmentcode() {
        return DepartmentCode;
    }

    public void setDepartmentcode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
