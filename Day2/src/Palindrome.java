//8. Check whether a given String is a Palindrome or not.
//
//Input: "racecar" → Palindrome
//Input: "hello"   → Not a Palindrome

import java.util.Scanner;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String st = sc.nextLine();

        System.out.println(isPalindrome(st));
    }

    public static String isPalindrome(String st){
        int left = 0;
        int right = st.length() - 1;

        while(left < right){
            if(st.charAt(left) != st.charAt(right)){
                return "Not a Palindrome";
            }
            left++;
            right--;
        }

        return "Palindrome";
    }
}