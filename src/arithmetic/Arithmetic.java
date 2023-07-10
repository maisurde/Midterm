/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
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

