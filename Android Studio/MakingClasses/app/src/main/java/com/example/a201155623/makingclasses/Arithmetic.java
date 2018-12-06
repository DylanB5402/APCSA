package com.example.a201155623.makingclasses;

public class Arithmetic {

    private double mOperand1;
    private double mOperand2;

    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public Arithmetic(double operand1, double operand2) {
        mOperand1 = operand1;
        mOperand2 = operand2;
    }

    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }

    public double add() {
        return mOperand1 + mOperand2;
    }

    public double subtract() {
        return mOperand1 - mOperand2;
    }

    public double multiply() {
        return mOperand1 * mOperand2;
    }

    public double divide() {
        return mOperand1 / mOperand2;
    }

}
