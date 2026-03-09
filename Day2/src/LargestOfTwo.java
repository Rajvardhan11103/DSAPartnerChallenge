// 5. Take 2 numbers as input and print the largest.

import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number :- ");
        double num1 = sc.nextDouble();

        System.out.println("Enter 2nd Number :- ");
        double num2 = sc.nextDouble();

        System.out.println("Largest Number is :- " + largest(num1,num2));
    }

    public static double largest(double num1 , double num2){
        if(num1 > num2){
            return  num1;
        }else{
            return num2;
        }
    }
}
