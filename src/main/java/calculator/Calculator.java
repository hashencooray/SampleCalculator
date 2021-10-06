package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        CalculatorFunctions calc = new CalculatorFunctions();
        Scanner scan = new Scanner(System.in);
        boolean exit=true;
        while (exit) {
            System.out.println("***********\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n\nselect operation  : ");
            int action = scan.nextInt();
        if(action != 5 ){
            System.out.println("Enter number 1 :");
            double number1=scan.nextDouble();
            System.out.println("Enter number 2 :");
            double number2=scan.nextDouble();
            switch (action) {
                case 1:
                    calc.addition(number1, number2);
                    break;
                case 2:
                    calc.substraction(number1, number2);
                    break;
                case 3:
                    calc.multiplication(number1, number2);
                    break;
                case 4:
                    calc.division(number1, number2);
                    break;
            }

        }
        else {
            exit=false;
        }

        }

    }
}
