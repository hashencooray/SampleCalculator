package calculator;

public class CalculatorFunctions {
    private static double total;

    static void addition(double num1, double num2){
        total= num1+num2;
        System.out.println("***********\nAnswer = " +total);
    }
    static void substraction(double num1, double num2){
        total= num1-num2;
        System.out.println("***********\nAnswer = " +total);
    }
    static void multiplication(double num1, double num2){
        total= num1*num2;
        System.out.println("***********\nAnswer = " +total);
    }
    static void division(double num1, double num2){
        if(num2!=0){
            total=num1/num2;
            System.out.println("***********\nAnswer = " +total);
        }
        else{
            System.out.println("***********\ncannot divide by 0");
        }
    }

}
