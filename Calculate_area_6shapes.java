import java.util.Scanner;

class Calculate_area_6shapes {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculate_area_6shapes calculator = new Calculate_area_6shapes();
        
        System.out.print("Enter the length of the rectangle: ");
        int length = calculator.sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = calculator.sc.nextInt();
        System.out.println("Area of Rectangle: " + calculator.calculateArea(length, width));

        System.out.print("Enter the side length of the square: ");
        int side = calculator.sc.nextInt();
        System.out.println("Area of Square: " + calculator.calculateArea(side));

        System.out.print("Enter the base length of the triangle: ");
        double base = calculator.sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = calculator.sc.nextDouble();
        System.out.println("Area of Triangle: " + calculator.calculateArea1(base, height));

        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = calculator.sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = calculator.sc.nextDouble();
        System.out.println("Area of Cylinder: " + calculator.calculateArea(cylinderRadius, cylinderHeight));

        System.out.print("Enter the side length of the cube: ");
        double cubeSide = calculator.sc.nextDouble();
        System.out.println("Area of Cube: " + calculator.calculateArea(cubeSide));
    }

    public double calculateArea1(double radius) {
        return Math.PI * radius * radius;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public int calculateArea(int side) {
        return side * side;
    }

    public double calculateArea1(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculateArea(double side) {
        return 6 * side * side;
    }
}
