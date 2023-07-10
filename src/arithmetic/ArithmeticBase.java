/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author Denishkumar Maisuriya 
 * 
 */




public class ArithmeticBase {
    public double calculate(double x, double y, ArithmeticOperation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}



public enum ArithmeticOperation 
{
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}



public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();
        
        double plusResult = r.calculate(n, m, ArithmeticOperation.PLUS);
        double minusResult = r.calculate(n, m, ArithmeticOperation.MINUS);
        double timesResult = r.calculate(n, m, ArithmeticOperation.TIMES);
        double divideResult = r.calculate(n, m, ArithmeticOperation.DIVIDE);
        
        System.out.println("Result (PLUS): " + plusResult);
        System.out.println("Result (MINUS): " + minusResult);
        System.out.println("Result (TIMES): " + timesResult);
        System.out.println("Result (DIVIDE): " + divideResult);
    }
}
 
