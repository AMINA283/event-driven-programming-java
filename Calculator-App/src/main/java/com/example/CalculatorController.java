
package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField display;

    private double firstOperand = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    // Handles number button clicks
    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        Button btn = (Button) event.getSource();
        String digit = btn.getText();

        if (startNewNumber) {
            display.setText(digit);
            startNewNumber = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    // Handles operator button clicks
    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        firstOperand = Double.parseDouble(display.getText());

        Button btn = (Button) event.getSource();
        operator = btn.getText();

        startNewNumber = true;
    }

    // Handles the equals button
    @FXML
    private void handleEquals(javafx.event.ActionEvent event) {
        if (operator.isEmpty()) {
            return;
        }

        double secondOperand = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;

            case "-":
                result = firstOperand - secondOperand;
                break;

            case "*":
                result = firstOperand * secondOperand;
                break;

            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    display.setText("Error");
                    startNewNumber = true;
                    operator = "";
                    return;
                }
                break;
        }

        display.setText(String.valueOf(result));
        startNewNumber = true;
        operator = "";
    }

    // Handles the clear button
    @FXML
    private void handleClear(javafx.event.ActionEvent event) {
        display.setText("0");
        firstOperand = 0;
        operator = "";
        startNewNumber = true;
    }
}
