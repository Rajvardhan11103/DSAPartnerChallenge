//3. Area of Rectangle
//
//Formula: length × breadth

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Triangle :- ");
        double length = sc.nextDouble();


        System.out.println("Enter breadth of Triangle :- ");
        double breadth = sc.nextDouble();

        System.out.println("Area of rectangle is :- "+ rectangleArea(length , breadth));
    }
    public static double rectangleArea(double l , double b){
        return l * b ;
    }

}
