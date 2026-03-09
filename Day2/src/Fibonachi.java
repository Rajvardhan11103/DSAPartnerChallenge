//7. Print the Fibonacci Series up to n numbers.
//
//Input: 7
//Output: 0 1 1 2 3 5 8

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:- ");
        int num = sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            System.out.print(fib(i) + " ");
        }
    }
    public static int fib(int num){
        if(num <= 1) return num;
        return fib(num-1) + fib(num -2);
    }
}
