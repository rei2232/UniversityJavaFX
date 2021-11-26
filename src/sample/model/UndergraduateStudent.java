package sample.model;

import java.util.Date;

public class UndergraduateStudent {
    private String StudentNumber; // primary key
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private UndergraduateMajor major;
    private int MajorID;
    private Minor minor;
    private int MinorID;
    private String Notes;

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
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

    public int getMajorID() {
        return MajorID;
    }

    public void setMajorID(UndergraduateMajor major) {
        MajorID = major.getMajorID();
    }

    public int getMinorID() {
        return MinorID;
    }

    public void setMinorID(Minor minor) {
        MinorID = minor.getMinorID();
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
