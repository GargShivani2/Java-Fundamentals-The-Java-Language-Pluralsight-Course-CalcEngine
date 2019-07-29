package com.company;

public class Main {

    public static void main(String[] args)
    {

        String[] statements =
         {
                "divide 100.0 50.0",   // 100.0 / 50.0 = 2.0
                "add 25.0 92.0",       // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0", // 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0"    // 11.0 * 3.0 = 33.0
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements)
        {
            //System.out.println("Processing statement to helper class : "+ statement);
            helper.process(statement);
            System.out.println(helper);
        }
    }






    public static void main(String[] args)
    {

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.println("get into calculator base class");
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }
    }
}
