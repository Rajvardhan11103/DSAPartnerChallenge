import java.util.Scanner;

public class GeometryAndSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Perimeter of Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double rectPerimeter = 2 * (length + breadth);
        System.out.printf("Perimeter of Rectangle: %.2f\n", rectPerimeter);

        // 2. Perimeter of Square
        System.out.print("\nEnter side of square: ");
        double side = sc.nextDouble();
        double squarePerimeter = 4 * side;
        System.out.printf("Perimeter of Square: %.2f\n", squarePerimeter);

        // 3. Perimeter of Rhombus
        System.out.print("\nEnter side of rhombus: ");
        double rSide = sc.nextDouble();
        double rhombusPerimeter = 4 * rSide;
        System.out.printf("Perimeter of Rhombus: %.2f\n", rhombusPerimeter);

        // 4. Volume of Prism
        System.out.print("\nEnter base area of prism: ");
        double baseAreaPrism = sc.nextDouble();
        System.out.print("Enter height of prism: ");
        double heightPrism = sc.nextDouble();
        double prismVolume = baseAreaPrism * heightPrism;
        System.out.printf("Volume of Prism: %.2f\n", prismVolume);

        // 5. Volume of Cylinder
        System.out.print("\nEnter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();
        double cylinderVolume = Math.PI * r * r * h;
        System.out.printf("Volume of Cylinder: %.2f\n", cylinderVolume);

        // 6. Volume of Sphere
        System.out.print("\nEnter radius of sphere: ");
        double sr = sc.nextDouble();
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sr, 3);
        System.out.printf("Volume of Sphere: %.2f\n", sphereVolume);

        // 7. Volume of Pyramid
        System.out.print("\nEnter base area of pyramid: ");
        double baseAreaPyramid = sc.nextDouble();
        System.out.print("Enter height of pyramid: ");
        double heightPyramid = sc.nextDouble();
        double pyramidVolume = (1.0 / 3.0) * baseAreaPyramid * heightPyramid;
        System.out.printf("Volume of Pyramid: %.2f\n", pyramidVolume);

        // 8. Curved Surface Area of Cylinder
        System.out.print("\nEnter radius of cylinder: ");
        double cr = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double ch = sc.nextDouble();
        double curvedSurface = 2 * Math.PI * cr * ch;
        System.out.printf("Curved Surface Area of Cylinder: %.2f\n", curvedSurface);

        // 9. Total Surface Area of Cube
        System.out.print("\nEnter side of cube: ");
        double cubeSide = sc.nextDouble();
        double cubeSurface = 6 * cubeSide * cubeSide;
        System.out.printf("Total Surface Area of Cube: %.2f\n", cubeSurface);

        // 10. Fibonacci Series
        System.out.print("\nEnter number of Fibonacci terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        // 11. Product - Sum of Digits
        System.out.print("\n\nEnter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        int result = product - sum;
        System.out.println("Result (Product - Sum): " + result);

        sc.close();
    }
}