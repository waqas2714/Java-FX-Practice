package com.example.myjavaapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SpinnerController implements Initializable {
    @FXML
    private Spinner<Integer> mySpinner;
    @FXML
    private Label myLabel;

    int currentValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> spinnerFactory =              //Min, Max
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20);
        mySpinner.setValueFactory(spinnerFactory);

        currentValue = mySpinner.getValue();
        myLabel.setText(Integer.toString(currentValue));

        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                currentValue = mySpinner.getValue();
                myLabel.setText(Integer.toString(currentValue));
            }
        });
    }
}
