// Interface Shape
interface Shape {
  double area();      // Method to calculate area
  double perimeter(); // Method to calculate perimeter
}

// Class Circle implements Shape interface
class Circle implements Shape {
  double radius;

  Circle(double radius) {
      this.radius = radius;
  }

  // Implement the area method
  @Override
  public double area() {
      return Math.PI * radius * radius;
  }

  // Implement the perimeter method
  @Override
  public double perimeter() {
      return 2 * Math.PI * radius;
  }
}

// Class Rectangle implements Shape interface
class Rectangle implements Shape {
  double length;
  double width;

  Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  // Implement the area method
  @Override
  public double area() {
      return length * width;
  }

  // Implement the perimeter method
  @Override
  public double perimeter() {
      return 2 * (length + width);
  }
}

// Main class
public class Main3 {
  public static void main(String[] args) {
      // Create objects of Circle and Rectangle
      Shape circle = new Circle(5);
      Shape rectangle = new Rectangle(4, 6);

      // Display area and perimeter of Circle
      System.out.println("Circle Area: " + circle.area());
      System.out.println("Circle Perimeter: " + circle.perimeter());

      // Display area and perimeter of Rectangle
      System.out.println("\nRectangle Area: " + rectangle.area());
      System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
  }
}

