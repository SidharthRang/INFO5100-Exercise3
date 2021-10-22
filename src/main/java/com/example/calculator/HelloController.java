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
        double num1,num2;
        try{
            num1 = Double.parseDouble(number1.getText());
            num2 = Double.parseDouble(number2.getText());
        }catch(NumberFormatException e){
            welcomeText.setText("Error: One of the entries is not a number");
            return;
        }
        double res = 0;
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
        welcomeText.setText("The result is "+ res);
    }
}