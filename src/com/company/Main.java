package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        String[] operator = {"Addition", "Subtraction", "Multiplication", "Division", "Squareroot"};
        int option = 0;

        option = JOptionPane.showOptionDialog(null, "Choose operator", "Choose operator",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, operator, operator[4]);


        firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Choose digit"));
        if(option < 4) {
            secondNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Choose second digit"));
        }

        switch (option){
            case 0:
                result = Addition.add(firstNumber, secondNumber);
                break;
            case 1:
                result = Subtraction.subtract(firstNumber, secondNumber);
                break;
            case 2:
                result = Multiplication.multiply(firstNumber, secondNumber);
                break;
            case 3:
                result = Division.divide(firstNumber, secondNumber);
                break;
            case 4:
                result = Squareroot.squareroot(firstNumber);
                break;
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
