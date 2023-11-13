package com.example.myjavaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CheckboxController {
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;
    @FXML
    private CheckBox myCheckbox;
    private Image img1 = new Image(getClass().getResourceAsStream("Cat1.jpg"));
    private Image img2 = new Image(getClass().getResourceAsStream("Cat2.jpg"));

    public void changeImage(ActionEvent e){
        if (myCheckbox.isSelected()){
            myImageView.setImage(img2);
            myLabel.setText("Cat 2");
        }else{
            myImageView.setImage(img1);
            myLabel.setText("Cat 1");
        }
    }

}
