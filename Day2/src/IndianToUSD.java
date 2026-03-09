//6. Input an amount in Indian Rupees and convert it to USD. (Use: 1 USD = 83.5 INR — update with current rate)

import java.util.Scanner;

public class IndianToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount :- ");
        double amount = sc.nextDouble();
        System.out.println("USD conversion of Given Amount is "+ convertUSD(amount));
    }
    public static double convertUSD(double amount){
        return  amount*0.011 ;
    }
}
