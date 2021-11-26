package sample.model;

public class CourseDeliveryType {
    private String CourseDeliveryTypeCode;
    private String CourseDeliveryType;
    private String Notes;

    public String getCourseDeliveryTypeCode() {
        return CourseDeliveryTypeCode;
    }

    public void setCourseDeliveryTypeCode(String courseDeliveryTypeCode) {
        CourseDeliveryTypeCode = courseDeliveryTypeCode;
    }

    public String getCourseDeliveryType() {
        return CourseDeliveryType;
    }

    public void setCourseDeliveryType(String courseDeliveryType) {
        CourseDeliveryType = courseDeliveryType;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
