package com.company;

public class CalculateHelper {

    private static final char Add_symbol = '+';
    private static final char Sub_symbol = '-';
    private static final char Mul_symbol = '*';
    private static final char Div_symbol = '/';

    private double leftVal;
    private double rightVal;
    private double result;
    private MathCommand command;

    public void process (String statement)
    {
        String[] parts = statement.split(" ");
        String commandString = parts[0]; // add
        leftVal = Double.parseDouble(parts[1]); // 1.0
        rightVal = Double.parseDouble(parts[2]); // 2.0
        setCommandFromString(commandString);
        CalculateBase calculator = null;
        //System.out.println("Command :"+ commandString + " Val1 : "+ leftVal + " val2 : "+rightVal);

        switch(command)
        {
            case Add:
                System.out.println("Addition");
                calculator = new Adder(leftVal,rightVal);
                break;
            case Subtract:
                System.out.println("Subtraction");
                calculator = new Subtracter(leftVal,rightVal);
                break;
            case Multiply:
                System.out.println("Multiplication");
                calculator = new Multiplier(leftVal,rightVal);
                break;
            case Divide:
                System.out.println("Dividing");
                calculator = new Divider(leftVal,rightVal);
                break;
        }

        calculator.calculate();
        result = calculator.getResult();


    }

    public void setCommandFromString(String commandString)
    {
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
        {
            command = MathCommand.Add;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
        {
            command = MathCommand.Subtract;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
        {
            command = MathCommand.Divide;
        }
        else
        {
            command = MathCommand.Multiply;
        }
    }

    @Override
    public String toString()
    {
        char symbol = ' ';
        switch(command)
        {
            case Add:
                symbol = Add_symbol;
                break;

            case Subtract:
                symbol = Sub_symbol;
                break;

            case Divide:
                symbol = Div_symbol;
                break;

            case Multiply:
                symbol = Mul_symbol;
                break;
        }
        StringBuilder sb =  new StringBuilder();
        sb.append(leftVal);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightVal);
        sb.append('=');
        sb.append(result);

        return sb.toString();
    }




}
