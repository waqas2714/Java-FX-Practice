package com.example.myjavaapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderController implements Initializable {
    @FXML
    private Slider mySlider;
    @FXML
    private Label myLabel;
    int sliderValue;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sliderValue = (int) mySlider.getValue();
        myLabel.setText(sliderValue + " Grams");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                sliderValue = (int) mySlider.getValue();
                myLabel.setText(sliderValue + " Grams");
            }
        });
    }
}
