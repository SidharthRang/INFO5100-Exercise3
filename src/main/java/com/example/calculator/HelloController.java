package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label operation;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private TextField result;

    @FXML
    protected void setOperator(ActionEvent e){
        Button b = (Button) e.getSource();
        operation.setText(b.getText());
    }


    @FXML
    protected void calculateResult(){
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        int res = 0;
        String operator = operation.getText();
        switch (operator){
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        result.setText(String.valueOf(res));
        welcomeText.setText("The result is "+String.valueOf(res));
    }
}