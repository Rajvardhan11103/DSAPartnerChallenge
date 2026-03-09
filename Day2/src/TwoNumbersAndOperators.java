//4. Take two numbers and an *operator (+, -, , /) as input and calculate the result using if conditions.
//
//Input: 10 + 5
//Output: 15


import java.util.Scanner;

public class TwoNumbersAndOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :- ");
        double num1 = sc.nextDouble();

        System.out.println("Enter 2nd Number :- ");
        double num2 = sc.nextDouble();

        System.out.println("Enter Operator (+,-,*,/) :- ");
        String operator = sc.next();

        System.out.println(outPut(num1,num2,operator));

    }
    public static double outPut(double num1 , double num2 , String operator){
        if(operator.equals("+")){
            return num1 + num2 ;
        }else if(operator.equals("-")){
            return num1 - num2 ;
        } else if (operator.equals("*")) {
            return  num1 * num2 ;
        }else {
            return num1 / num2 ;
        }
    }
}
