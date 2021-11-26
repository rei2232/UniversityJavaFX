package sample.model;

public class UndergraduateCourse {
    private String CourseCode;
    private String CourseName;
    private int Credits;
    private String CourseDescription;
    private String Prerequisites;
    private String Notes;

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        Credits = credits;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    public String getPrerequisites() {
        return Prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        Prerequisites = prerequisites;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
