package com.example.javafx_interest_balance_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.NumberFormat;

public class HelloController {
    @FXML
    private TextField initialDepositField;
    @FXML
    private TextField annualInterestRateField;
    @FXML
    private TextField yearsField;
    @FXML
    private Label finalBalanceValue;

    @FXML
    protected void onCalculateButtonClick() {
        try {
            double initialDeposit = Double.parseDouble(initialDepositField.getText());
            double annualInterestRate = Double.parseDouble(annualInterestRateField.getText());
            int years = Integer.parseInt(yearsField.getText());

            BankAccount account = new BankAccount(initialDeposit);
            account.calculateFinalBalance(annualInterestRate, years);

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
            finalBalanceValue.setText(currencyFormat.format(account.getBalance()));
        } catch (NumberFormatException ex) {
            finalBalanceValue.setText("Invalid input.");
        }
    }
}