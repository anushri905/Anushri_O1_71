class Student{
      String name;
      int age;
  
      // Default constructor
      Student() {
          name = "Unknown";
          age = 0;
          System.out.println("Default constructor called");
      }
  
      // Parameterized constructor (overloading)
      Student(String n, int a) {
          name = n;
          age = a;
          System.out.println("Parameterized constructor called");
      }
  
      // Overloaded method
      void display() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
      }
  
      // Overloaded method with one parameter
      void display(String message) {
          System.out.println(message);
          System.out.println("Name: " + name + ", Age: " + age);
      }
  
      // Simulated destructor using finalize() (Not reliable or recommended for actual use)
      @Override
      protected void finalize() throws Throwable {
          System.out.println("Object is being destroyed: " + name);
      }
  }
  
  // Main class
  public class Main1{
      public static void main(String[] args) {
          // Creating objects
          Student s1 = new Student(); // Default constructor
          Student s2 = new Student("Anushri", 21); // Parameterized constructor
  
          // Using overloaded methods
          s1.display();
          System.out.println();
          s2.display("Displaying Student Info:");
  
          // Hint the garbage collector (not guaranteed)
          s1 = null;
          s2 = null;
          System.gc(); // Request JVM to run garbage collector
      }
  }
  
  

