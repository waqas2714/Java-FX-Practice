package com.example.myjavaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Spinner.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image("cattoo.jpg");
//        String css = this.getClass().getResource("style.css").toExternalForm();
//        scene.getStylesheets().add(css);

        stage.setTitle("Stage Demo");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}