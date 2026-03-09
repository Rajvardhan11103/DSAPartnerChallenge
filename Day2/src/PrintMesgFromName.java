//2. Take a name as input and print a greeting message for that name.
//
//Input: Tripti
//Output: Hello Tripti, welcome to the DSA Challenge!

import java.util.Scanner;

public class PrintMesgFromName {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(printMesg(name));
    }
    public static String printMesg(String str){
        return "Hello "+str+", Welcome to The DSA Challenge !!";
    }
}
