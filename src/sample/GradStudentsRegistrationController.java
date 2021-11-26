package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GradStudentsRegistrationController {
    @FXML
    public Button btnClose;

    @FXML
    public TextField txtStudentNumber;
    @FXML
    public Button btnStudentsNumber;

    @FXML
    public Button btnShowAll;

    @FXML
    public Button btnStudentName;
    @FXML
    public TextField txtStudentName;

    @FXML
    public TextField txtSemester;
    @FXML
    public Button btnSemester;

    @FXML
    public TextField txtCourseCode;
    @FXML
    public Button btnCourseCode;

    @FXML
    public TextField txtCourseName;
    @FXML
    public Button btnCourseName;



    public void close(ActionEvent e) { // close stage
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }
}
