import java.io.*;

public class Main7 {
    public static void main(String[] args) {
        // Writing to a file using FileWriter
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("We are writing data into the file.\n");
            writer.close(); // Always close the writer to save changes

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

