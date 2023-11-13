package com.example.myjavaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceboxController implements Initializable {//Implemented Initializable cz there were no action methods for choiceBox on scene builder
    @FXML
    private ChoiceBox<String> myChoiceBox;
    @FXML
    private Label myLabel;
    String food[] = {"Biryani", "Pizza", "Karahi"};

    @Override
    //If you want to do anything after the root controller is mounted, you use this function
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);
    }
    public void getFood(ActionEvent actionEvent){
        String value = myChoiceBox.getValue();
        myLabel.setText(String.format("I will take: %s", value));
    }
}