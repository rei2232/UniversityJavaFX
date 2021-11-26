package sample.model;

public class Minor {
    private int MinorID; // primary key
    private String Minor;
    private String Notes;

    public int getMinorID() {
        return MinorID;
    }

    public void setMinorID(int minorID) {
        MinorID = minorID;
    }

    public String getMinor() {
        return Minor;
    }

    public void setMinor(String minor) {
        Minor = minor;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
