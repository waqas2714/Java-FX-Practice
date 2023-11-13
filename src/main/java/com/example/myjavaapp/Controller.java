package com.example.myjavaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML

    private Arc myArc;
    private double x;
    private double y;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToScene1(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHomeScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void up(ActionEvent e){
        myArc.setRotate(270);
        myArc.setCenterY(y -= 15);
    }
    public void down(ActionEvent e){
        myArc.setRotate(90);
        myArc.setCenterY(y += 15);
    }
    public void left(ActionEvent e){
        myArc.setRotate(180);
        myArc.setCenterX(x -= 15);
    }
    public void right(ActionEvent e){
        myArc.setRotate(360);
        myArc.setCenterX(x += 15);
    }
}
