package sample.model;

public class Semester {
    private int SemesterID;
    private String Semester;
    private String Notes;

    public int getSemesterID() {
        return SemesterID;
    }

    public void setSemesterID(int semesterID) {
        SemesterID = semesterID;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
