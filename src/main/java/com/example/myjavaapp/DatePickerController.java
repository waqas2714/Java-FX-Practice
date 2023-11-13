package com.example.myjavaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerController {
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myLabel;

    public void pickDate(ActionEvent e){
        LocalDate myDate = myDatePicker.getValue();
        String formattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        myLabel.setText(formattedDate);
    }
}
