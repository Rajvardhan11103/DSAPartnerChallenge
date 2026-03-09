import java.util.Scanner;

//3. Input Principal (P), Time (T), Rate (R) from the user and calculate Simple Interest.
//
//SI = (P * T * R) / 100
public class PrincipalInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal :-");
        Double principal = sc.nextDouble();

        System.out.println("Enter Time :-");
        Double Time = sc.nextDouble();

        System.out.println("Enter Rate :-");
        Double Rate = sc.nextDouble();

        System.out.println("Simple Interest is :- "+calculateSI(principal,Time,Rate));
    }
    public static double calculateSI(Double principal, Double time, Double rate){
        return (principal*time*rate)/100 ;
    }
}
