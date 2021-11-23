package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UnderStudentController {  //  Major
    @FXML
    public Button btnClose;

//    @FXML
//    public TableView<> dgvMajors;

    @FXML
    public Button newUnderStudent;

    public void newUnderStudentStage(ActionEvent e) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UndMajor2Stage.fxml"));
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

    public void close(ActionEvent e) { // close stage
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }
}
