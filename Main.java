// Define the class
class Car {
    // Attributes (fields)
    String brand;
    String model;
    int year;
    // Constructor
    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects of Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Call methods on the objects
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        System.out.println("\nCar 2 Details:");
        car2.displayInfo();
    }
}
