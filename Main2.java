
  class Person {
      String name;
      int age;
  
      // Constructor for Person
      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }
  
      // Method to display details
      void displayInfo() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
      }
  }
  
  // Subclass (Child class)
  class Student extends Person {
      String course;
  
      // Constructor for Student
      Student(String name, int age, String course) {
          // Call parent constructor
          super(name, age);
          this.course = course;
      }
  
      // Overriding displayInfo method
      @Override
      void displayInfo() {
          super.displayInfo(); // Call parent method
          System.out.println("Course: " + course);
      }
  }
  
  // Main class
  public class Main2{
      public static void main(String[] args) {
          // Create a Student object
          Student s1 = new Student("Anushri", 21, "Computer Science");
  
          // Display details using inherited and overridden method
          s1.displayInfo();
      }
  }
  
  

