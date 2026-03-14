//2. Area of Triangle
//
//Formula: ½ × base × height

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Base of Triangle :- ");
        double base = sc.nextDouble();

        System.out.println("enter height of Triangle :- ");
        double height = sc.nextDouble();

        System.out.println("Area of Triangle is :- " + triangleArea(base,height));
    }
    public static double triangleArea(double b , double h){
        return 0.5 * b * h ;
    }
}
