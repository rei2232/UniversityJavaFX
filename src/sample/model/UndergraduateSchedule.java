package sample.model;

import java.util.Date;

public class UndergraduateSchedule {
    private int UndergraduateScheduleID;
    private Semester semester;
    private int SemesterID;
    private Date StartDate;
    private Date EndDate;
    private Date StartTime;
    private Date EndTime;
    private String Weekdays;
    private Teacher mainTeacher;
    private Teacher assistantTeacher;
    private String TeacherNumber;
    private String TANumber;
    private UndergraduateCourse course;
    private String CourseCode;
    private CourseDeliveryType courseDeliveryType;
    private String CourseDeliveryTypeCode;
    private Location location;
    private String LocationCode;
    private String RoomNumber;
    private String Notes;

    public int getUndergraduateScheduleID() {
        return UndergraduateScheduleID;
    }

    public void setUndergraduateScheduleID(UndergraduateSchedule schedule) {
        UndergraduateScheduleID = schedule.getUndergraduateScheduleID();
    }

    public int getSemesterID() {
        return SemesterID;
    }

    public void setSemesterID(Semester semester) {
        SemesterID = semester.getSemesterID();
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public String getWeekdays() {
        return Weekdays;
    }

    public void setWeekdays(String weekdays) {
        Weekdays = weekdays;
    }

    public String getTeacherNumber() {
        return TeacherNumber;
    }

    public void setTeacherNumber(Teacher teacher) {
        TeacherNumber = teacher.getTeacherNumber();
    }

    public String getTANumber() {
        return TANumber;
    }

    public void setTANumber(Teacher teacher) {
        this.TANumber = teacher.getTeacherNumber();
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(UndergraduateCourse course) {
        CourseCode = course.getCourseCode();
    }

    public String getCourseDeliveryTypeCode() {
        return CourseDeliveryTypeCode;
    }

    public void setCourseDeliveryTypeCode(CourseDeliveryType courseDeliveryType) {
        CourseDeliveryTypeCode = courseDeliveryType.getCourseDeliveryTypeCode();
    }

    public String getLocationCode() {
        return LocationCode;
    }

    public void setLocationCode(Location location) {
        LocationCode = location.getLocationCode();
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
