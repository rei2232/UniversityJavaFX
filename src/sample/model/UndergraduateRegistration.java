package sample.model;

import java.util.Date;

public class UndergraduateRegistration {
    private int RegistrationID;
    private Date RegistrationDate;
    private UndergraduateStudent student;
    private String StudentNumber;
    private UndergraduateSchedule schedule;
    private int UndergraduateScheduleID;
    private String LetterGrade;
    private PassesFailsStatus passfail;
    private String PassFailStatus;
    private int CourseCredit;
    private int TotalCurentCredit;
    private String Notes;

    public int getRegistrationID() {
        return RegistrationID;
    }

    public void setRegistrationID(int registrationID) {
        RegistrationID = registrationID;
    }

    public Date getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        RegistrationDate = registrationDate;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(UndergraduateStudent student) {
        StudentNumber = student.getStudentNumber();
    }

    public int getUndergraduateScheduleID() {
        return UndergraduateScheduleID;
    }

    public void setUndergraduateScheduleID(UndergraduateSchedule schedule) {
        UndergraduateScheduleID = schedule.getUndergraduateScheduleID();
    }

    public String getLetterGrade() {
        return LetterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        LetterGrade = letterGrade;
    }

    public String getPassFailStatus() {
        return PassFailStatus;
    }

    public void setPassFailStatus(PassesFailsStatus status) {
        PassFailStatus = status.getPassFailStatus();
    }

    public int getCourseCredit() {
        return CourseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        CourseCredit = courseCredit;
    }

    public int getTotalCurentCredit() {
        return TotalCurentCredit;
    }

    public void setTotalCurentCredit(int totalCurentCredit) {
        TotalCurentCredit = totalCurentCredit;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
