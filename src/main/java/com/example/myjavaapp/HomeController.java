package com.example.myjavaapp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController {
    @FXML
    Label nameLable;
    @FXML
    AnchorPane pane;
    Stage stage;
    public void displayName(String userName){
        nameLable.setText("Hey! "+userName);
    }

    public void logout(ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are going to log out.");
        alert.setContentText("You rlly wanna do itt?");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)pane.getScene().getWindow();
            System.out.println("You logged Out Successfully!");
            stage.close();
        }

    }
}
