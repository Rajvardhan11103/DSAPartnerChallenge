//1. Write a program to print whether a number is even or odd — take input from the user.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = checkEvenOdd(num);
        System.out.println(str);
    }

    public static String checkEvenOdd(int num){
        if((num & 1) == 1){
            return "Given number "+ num +" is Odd";
        }else {
            return "Given number "+ num +" is Even";
        }
    }
}
