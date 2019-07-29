package com.company;

public class Subtracter extends CalculateBase {
    public Subtracter()
    {

    }
    public Subtracter(double leftVal, double rightVal)
    {
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = this.getLeftVal() - this.getRightVal();
        this.setResult(value);

    }
}
