package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label resultText;

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
        Button b = (Button) e.getSource(); //Get button that initiated the action
        operation.setText(b.getText()); // Set operator from button text
    }


    @FXML
    protected void calculateResult(){
        double num1,num2; //declare two variables as double for decimal values

        //check if text is valid number. If not throw exception and end the action
        try{
            num1 = Double.parseDouble(number1.getText());
            num2 = Double.parseDouble(number2.getText());
        }catch(NumberFormatException e){
            resultText.setText("Error: One of the entries is not a number");
            return;
        }
        double res = 0;
        String operator = operation.getText();

        //perform calculation based on operator
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

        //display result
        resultText.setText("The result is "+ res);
    }
}