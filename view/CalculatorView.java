package com.mdhasnainali.calculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    private final JFrame frame;

    private final JLabel displayBarText;

    private final JPanel buttonContainer;
    private final JPanel buttonBasicContainer;
    private final JPanel buttonControllerContainer;

    private final JButton buttonZero;
    private final JButton buttonOne;
    private final JButton buttonTwo;
    private final JButton buttonThree;
    private final JButton buttonFour;
    private final JButton buttonFive;
    private final JButton buttonSix;
    private final JButton buttonSeven;
    private final JButton buttonEight;
    private final JButton buttonNine;
    private final JButton buttonPlus;
    private final JButton buttonMinus;
    private final JButton buttonMultiply;
    private final JButton buttonDivision;
    private final JButton buttonDot;
    private final JButton buttonEqual;
    private final JButton buttonClear;
    private final JButton buttonDelete;
    private final JButton buttonAns;

    private String displayString;


    public CalculatorView(){
        displayString = "";

        frame = new JFrame();
        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayBarText = new JLabel();
        displayBarText.setFont(new Font("Hack",Font.BOLD,20));
        displayBarText.setForeground(Color.RED);
        displayBarText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayBarText.setBounds(25,25,350,100);

        buttonContainer = new JPanel();
        buttonContainer.setBounds(25,125,350,400);
        buttonContainer.setLayout(new BorderLayout(0,0));

        buttonBasicContainer = new JPanel();
        buttonBasicContainer.setLayout(new GridLayout(4,4));

        buttonControllerContainer = new JPanel();
        buttonControllerContainer.setLayout(new GridLayout(1,3));
        buttonControllerContainer.setPreferredSize(new Dimension(350,50));


        buttonZero = new JButton("0");
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivision = new JButton("/");
        buttonDot = new JButton(".");
        buttonEqual = new JButton("=");
        buttonClear = new JButton("Clear");
        buttonDelete = new JButton("Delete");
        buttonAns = new JButton("Ans");

        buttonBasicContainer.add(buttonSeven);
        buttonBasicContainer.add(buttonEight);
        buttonBasicContainer.add(buttonNine);
        buttonBasicContainer.add(buttonDivision);

        buttonBasicContainer.add(buttonFour);
        buttonBasicContainer.add(buttonFive);
        buttonBasicContainer.add(buttonSix);
        buttonBasicContainer.add(buttonMultiply);

        buttonBasicContainer.add(buttonOne);
        buttonBasicContainer.add(buttonTwo);
        buttonBasicContainer.add(buttonThree);
        buttonBasicContainer.add(buttonMinus);

        buttonBasicContainer.add(buttonDot);
        buttonBasicContainer.add(buttonZero);
        buttonBasicContainer.add(buttonEqual);
        buttonBasicContainer.add(buttonPlus);

        buttonControllerContainer.add(buttonDelete);
        buttonControllerContainer.add(buttonClear);
        buttonControllerContainer.add(buttonAns);


        buttonContainer.add(buttonBasicContainer,BorderLayout.CENTER);
        buttonContainer.add(buttonControllerContainer, BorderLayout.SOUTH);

        frame.add(displayBarText);
        frame.add(buttonContainer);


        frame.setVisible(true);
    }

    public void buttonActionControl(ActionListener e){
        buttonZero.addActionListener(e);
        buttonOne.addActionListener(e);
        buttonTwo.addActionListener(e);
        buttonThree.addActionListener(e);
        buttonFour.addActionListener(e);
        buttonFive.addActionListener(e);
        buttonSix.addActionListener(e);
        buttonSeven.addActionListener(e);
        buttonEight.addActionListener(e);
        buttonNine.addActionListener(e);
        buttonPlus.addActionListener(e);
        buttonMinus.addActionListener(e);
        buttonMultiply.addActionListener(e);
        buttonDivision.addActionListener(e);
        buttonDot.addActionListener(e);
        buttonEqual.addActionListener(e);
        buttonClear.addActionListener(e);
        buttonDelete.addActionListener(e);
        buttonAns.addActionListener(e);
    }

    public String getDisplayString(){
        this.displayString = displayBarText.getText();
        return displayString;
    }

    public void setDisplayString(String newDisplay){
        this.displayString = newDisplay;
        displayBarText.setText(displayString);
    }


}
