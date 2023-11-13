package com.example.myjavaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField ageTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private int age;
    @FXML
    private Label topMessage;
    public void login(ActionEvent e) throws IOException {
        String userName = nameTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        root = loader.load();
        HomeController homeController = loader.getController();
        homeController.displayName(userName);

        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void submit(ActionEvent e){
        try {
            age = Integer.parseInt(ageTextField.getText());
            if (age <  18){
                topMessage.setText("You must be 18+");
            }else{
                topMessage.setText("Signed up successfully!");
            }
        }catch (NumberFormatException error){
            topMessage.setText("Please enter a number in input.");
        }
    }
}
