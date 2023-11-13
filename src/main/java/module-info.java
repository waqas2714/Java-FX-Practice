module com.example.myjavaapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.myjavaapp to javafx.fxml;
    exports com.example.myjavaapp;
}