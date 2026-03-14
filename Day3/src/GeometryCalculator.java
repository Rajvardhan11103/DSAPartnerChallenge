import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 4. Area of Isosceles Triangle
        System.out.print("Enter base of Isosceles Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Isosceles Triangle: ");
        double height = sc.nextDouble();

        double isoArea = 0.5 * base * height;
        System.out.printf("Area of Isosceles Triangle: %.2f\n", isoArea);


        // 5. Area of Parallelogram
        System.out.print("\nEnter base of Parallelogram: ");
        double pBase = sc.nextDouble();
        System.out.print("Enter height of Parallelogram: ");
        double pHeight = sc.nextDouble();

        double paraArea = pBase * pHeight;
        System.out.printf("Area of Parallelogram: %.2f\n", paraArea);


        // 6. Area of Rhombus
        System.out.print("\nEnter diagonal d1 of Rhombus: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter diagonal d2 of Rhombus: ");
        double d2 = sc.nextDouble();

        double rhombusArea = 0.5 * d1 * d2;
        System.out.printf("Area of Rhombus: %.2f\n", rhombusArea);


        // 7. Area of Equilateral Triangle
        System.out.print("\nEnter side of Equilateral Triangle: ");
        double side = sc.nextDouble();

        double eqArea = (Math.sqrt(3) / 4) * side * side;
        System.out.printf("Area of Equilateral Triangle: %.2f\n", eqArea);


        // 8. Perimeter of Circle
        System.out.print("\nEnter radius of Circle: ");
        double r = sc.nextDouble();

        double circumference = 2 * Math.PI * r;
        System.out.printf("Perimeter (Circumference) of Circle: %.2f\n", circumference);


        // 9. Perimeter of Equilateral Triangle
        System.out.print("\nEnter side of Equilateral Triangle: ");
        double s = sc.nextDouble();

        double eqPerimeter = 3 * s;
        System.out.printf("Perimeter of Equilateral Triangle: %.2f\n", eqPerimeter);


        // 10. Perimeter of Parallelogram
        System.out.print("\nEnter side a of Parallelogram: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b of Parallelogram: ");
        double b = sc.nextDouble();

        double paraPerimeter = 2 * (a + b);
        System.out.printf("Perimeter of Parallelogram: %.2f\n", paraPerimeter);

        sc.close();
    }
}