package com.example.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class HelloController {
    public BorderPane pane;
    public Button mainButton;
    public Label nasobek;
    public TextField TxtField;
    public Button resetButton;
    int nas = 1;



    public void onAction(ActionEvent actionEvent) {

        int cislo = Integer.parseInt(TxtField.getText());

            nas++;
            int vysledek1 = cislo*nas;

            nasobek.setText(String.valueOf(vysledek1));

            }


    public void ResetAction(ActionEvent actionEvent) {
        nas = 1;
        nasobek.setText(String.valueOf(0));
    }
}


