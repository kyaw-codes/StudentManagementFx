package com.example.studentregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    @FXML
    private Button btnAddClassroom;
    @FXML
    private Button btnAddStudent;
    @FXML
    private Button btnDeleteStudent;
    @FXML
    private Button btnEditStudent;
    @FXML
    private ComboBox<Classroom> cmbClassroom;
    @FXML
    private TableColumn<String, Student> colClassroom;
    @FXML
    private TableColumn<LocalDate, Student> colDob;
    @FXML
    private TableColumn<String, Student> colNRC;
    @FXML
    private TableColumn<String, Student> colName;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TableView<Student> tableView;
    @FXML
    private TextField txtNRC;
    @FXML
    private TextField txtName;

    private final DataStore store = DataStore.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnAddStudent.setOnAction(e -> onAddStudentClick());
        btnDeleteStudent.setOnAction(e -> onDeleteStudentClick());
        btnEditStudent.setOnAction(e -> onEditStudentClick());

        btnAddClassroom.setOnAction(event -> {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ClassroomController.class.getResource("classroom-view.fxml"));

            try {
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Prepare data
        cmbClassroom.getItems().addAll(store.classrooms);
        cmbClassroom.getSelectionModel().select(0);
        tableView.getItems().addAll(store.students);
    }

    private void onAddStudentClick() {
        Student student = new Student();
        student.setName(txtName.getText());
        student.setNrc(txtNRC.getText());
        student.setClassroom(cmbClassroom.getSelectionModel().getSelectedItem());
        student.setDob(datePicker.getValue());

        store.students.add(student);
        tableView.getItems().add(student);
    }

    private void onEditStudentClick() {
        System.out.println("Edit Student");
    }

    private void onDeleteStudentClick() {
        System.out.println("Delete Student");
    }
}
