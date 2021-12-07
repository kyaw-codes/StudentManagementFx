package com.example.studentregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassroomController implements Initializable {

    @FXML
    Button btnSave;
    @FXML
    TextField txtClassroom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnSave.setOnAction(new ClassroomController()::onSaveClick);
    }

    private void onSaveClick(ActionEvent event) {
        Button btnClicked = (Button) event.getSource();
        Stage stage = (Stage) btnClicked.getScene().getWindow();
        stage.close();
    }
}
