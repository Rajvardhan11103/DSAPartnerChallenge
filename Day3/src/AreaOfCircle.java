
//1. Area of Circle
//
//Formula: π × r² (use Math.PI in Java)

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Radius of Circle :- ");
        double radius = sc.nextDouble();
        System.out.println("Area of circle having radius " + radius + " is :-" + circleArea(radius));
    }
    public static double circleArea(double r){
        return Math.PI * r ;
    }
}
