package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class UndergradStudentsController {
//    @FXML
//    public TableView<> dgvStudents;

    @FXML
    public Button btnClose;


    public void close(ActionEvent e) { // close stage
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }

}
