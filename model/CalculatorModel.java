package com.mdhasnainali.calculator.model;

public class CalculatorModel {
    private double calculatedValue;

    public CalculatorModel(){
        this.calculatedValue = 0;
    }

    public void addTwoNumber(double firstNumber, double secondNumber){
        this.calculatedValue = firstNumber + secondNumber;
    }
    public void subtractTwoNumber(double firstNumber, double secondNumber){
        this.calculatedValue = firstNumber - secondNumber;
    }
    public void multiplyTwoNumber(double firstNumber, double secondNumber){
        this.calculatedValue = firstNumber * secondNumber;
    }
    public void divideTwoNumber(double firstNumber, double secondNumber){
        this.calculatedValue = firstNumber / secondNumber;
    }
    public double getCalculatedValue(){
        return this.calculatedValue;
    }
    public void setCalculatedValue(double calculatedValue){
        this.calculatedValue = calculatedValue;
    }
}
