package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MenuController {
    @FXML
    public Button btnClose;


    public void btnUndergraduateStudents(ActionEvent e) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UnderGradStudentsStage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
//            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("University - Undergraduate Students");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void btnGraduateStudents(ActionEvent e) {

    }

    public void btnUndergraduateRegistration(ActionEvent e) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UnderGradRegistrationStage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
//            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("University - Undergraduate Registration");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void btnGraduateRegistrations(ActionEvent e) {

    }

    public void btnUndergraduateMajors(ActionEvent e) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("undergraduateStudentsStage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
//            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("University - Undergraduate Major");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void btGraduateMajors(ActionEvent e) {

    }

    public void btnEmployeees(ActionEvent e) {

    }
    public void close(ActionEvent e) { // close stage
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }
}
