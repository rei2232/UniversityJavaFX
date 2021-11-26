package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewGradMajorController {
    @FXML
    public Button btnClose;

    @FXML
    public TextField txtMajor;

//    @FXML
//    public ComboBox<> cbxDeans;

    @FXML
    public Button btnOK;

    public void close(ActionEvent e) { // close stage
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }
}
