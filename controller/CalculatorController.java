package com.mdhasnainali.calculator.controller;

import com.mdhasnainali.calculator.model.CalculatorModel;
import com.mdhasnainali.calculator.view.CalculatorView;
import com.mdhasnainali.calculator.view.ErrorWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorController implements ActionListener {
    CalculatorView calculatorView;
    CalculatorModel calculatorModel;

    String lastAns;
    String displayString;
    ArrayList <Character> operators = new ArrayList<>();

    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel){
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        this.calculatorView.buttonActionControl(this);

        this.lastAns = "0";

        operators.add('+');
        operators.add('-');
        operators.add('*');
        operators.add('/');
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "+", "-", "*", "/" :
                numberButtonPressed(e.getActionCommand());
                break;
            case "=" :
                doCalculation();
                break;
            case "Ans" :
                ansKeyPressed();
                break;
            case "Clear" :
                clearKeyPressed();
                break;
            case "Delete" :
                deleteKeyPressed();
                break;
        }
    }

    private void numberButtonPressed(String button){
        if(operators.contains(button.charAt(0))){
            calculatorView.setDisplayString(calculatorView.getDisplayString() + " " + button + " ");
        }
        else{
            calculatorView.setDisplayString(calculatorView.getDisplayString() + button);
        }
    }

    private void ansKeyPressed(){
        displayString = calculatorView.getDisplayString();
        if(displayString.length() > 1 && operators.contains(displayString.charAt(displayString.length()-2))){
            calculatorView.setDisplayString(displayString + lastAns);
        }
        else{
            calculatorView.setDisplayString(lastAns);
        }
    }

    private void clearKeyPressed(){
        calculatorView.setDisplayString("");
    }

    private void deleteKeyPressed(){
        displayString = calculatorView.getDisplayString();
        int length = displayString.length();
        if(length != 0){
            if(displayString.charAt(length - 1) == ' '){
                calculatorView.setDisplayString(displayString.substring(0,length - 3));
            }
            else{
                calculatorView.setDisplayString(displayString.substring(0,length - 1));
            }
        }
    }

    private void doCalculation(){
        displayString = calculatorView.getDisplayString();
        String[] array = displayString.split(" ");
        if(array.length != 3){
            ErrorWindow errorWindow = new ErrorWindow("There is a error. Please try again.");
        }
        else{
            double firstNumber = Double.parseDouble(array[0]);
            double secondNumber = Double.parseDouble(array[2]);
            if(array[1].equals("+")){
                calculatorModel.addTwoNumber(firstNumber,secondNumber);
            }
            else if(array[1].equals("-")){
                calculatorModel.subtractTwoNumber(firstNumber,secondNumber);
            }
            else if(array[1].equals("*")){
                calculatorModel.multiplyTwoNumber(firstNumber,secondNumber);
            }
            else if(array[1].equals("/")) {
                calculatorModel.divideTwoNumber(firstNumber, secondNumber);
            }
            else{
                ErrorWindow errorWindow = new ErrorWindow("There is a error. Please try again.");
                calculatorModel.setCalculatedValue(0);
            }
            lastAns = Double.toString(calculatorModel.getCalculatedValue());
            calculatorView.setDisplayString(lastAns);
        }
    }
}
