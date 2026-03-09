//9. Find all Armstrong Numbers between two given numbers.
//
//An Armstrong number = sum of each digit raised to the power of number of digits e.g. 153 = 1³ + 5³ + 3³ = 153 ✅

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num){

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }
}