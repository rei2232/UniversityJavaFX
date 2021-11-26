package sample.model;

public class UndergraduateCoursesTaught {
    private int CourseTaughtID;
    private Teacher teacher;
    private String TeacherNumber;
    private UndergraduateCourse course;
    private String CourseCode;
    private String Notes;

    public int getCourseTaughtID() {
        return CourseTaughtID;
    }

    public void setCourseTaughtID(int courseTaughtID) {
        CourseTaughtID = courseTaughtID;
    }

    public String getTeacherNumber() {
        return TeacherNumber;
    }

    public void setTeacherNumber(Teacher teacher) {
        TeacherNumber =  teacher.getTeacherNumber();
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(UndergraduateCourse course) {
        CourseCode = course.getCourseCode();
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
