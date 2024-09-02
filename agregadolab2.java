import java.util.Scanner;

// Base class: Shape
class Shape {
    protected double radius;  // Radius of the cylinder
    protected double height;  // Height of the cylinder
    protected final double PI = 3.14159;  // Constant value for PI

    // Constructor to initialize radius and height
    public Shape(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
}

// Derived class: Cylinder, which inherits from Shape
class Cylinder extends Shape {

    // Constructor to initialize radius and height using the base class constructor
    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    // Method to calculate the surface area of the cylinder
    public double calculateArea() {
        double area = 2 * PI * radius * radius + 2 * PI * radius * height;
        return area;
    }

    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        double volume = PI * radius * radius * height;
        return volume;
    }
}

// Main class: Program entry point
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the radius and height of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Create a Cylinder object with the provided radius and height
        Cylinder cylinder = new Cylinder(radius, height);

        // Calculate and display the area of the cylinder
        double area = cylinder.calculateArea();
        System.out.println("Surface Area of the Cylinder: " + area);

        // Calculate and display the volume of the cylinder
        double volume = cylinder.calculateVolume();
        System.out.println("Volume of the Cylinder: " + volume);
    }
}