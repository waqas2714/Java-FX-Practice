package com.example.myjavaapp;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
    @FXML
    private ImageView myImageView;
    Image img;

    public void changeImage(){

        img = new Image(getClass().getResourceAsStream("Cat2.jpg"));
        myImageView.setImage(img);
    }

    public void changeImageAgain(){
        img = new Image(getClass().getResourceAsStream("Cat1.jpg"));
        myImageView.setImage(img);
    }
}
