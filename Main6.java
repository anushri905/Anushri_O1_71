// Generic class
class Box<T> {
  private T value;

  // Constructor to set value
  public Box(T value) {
      this.value = value;
  }

  // Getter method to return the value
  public T getValue() {
      return value;
  }

  // Setter method to set a new value
  public void setValue(T value) {
      this.value = value;
  }
}

public class Main6 {
  public static void main(String[] args) {
      // Create Box objects with different types (String and Integer)
      Box<String> stringBox = new Box<>("Hello, Generics!");
      Box<Integer> integerBox = new Box<>(123);

      // Display values
      System.out.println("String Box contains: " + stringBox.getValue());
      System.out.println("Integer Box contains: " + integerBox.getValue());
  }
}

