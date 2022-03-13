package com.mdhasnainali.calculator;

import com.mdhasnainali.calculator.controller.CalculatorController;
import com.mdhasnainali.calculator.model.CalculatorModel;
import com.mdhasnainali.calculator.view.CalculatorView;

public class Calculator {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();

        CalculatorController calculatorController = new CalculatorController(calculatorView, calculatorModel);

    }
}
