module com.example.studentregistration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentregistration to javafx.fxml;
    exports com.example.studentregistration;
}