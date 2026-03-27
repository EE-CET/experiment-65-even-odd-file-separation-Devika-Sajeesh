import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        // Step 1: Read from numbers.txt and separate into even.txt and odd.txt
        // Hint: Use Scanner to read from the file and PrintWriter to write to files.
        try {
            // Initialize Scanner for numbers.txt
            Scanner scanner = new Scanner(new File("numbers.txt"));
            // Initialize PrintWriter for even.txt and odd.txt
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");
            
            // Loop through the input file, check if numbers are even or odd, and write to respective files
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }
            
            // Close all resources (Scanner and both PrintWriters) to save the files properly
            scanner.close();
            evenWriter.close();
            oddWriter.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Read and display even.txt
        System.out.print("Even File: ");
        // Read even.txt and print its contents on a single line
        try {
            Scanner scanner = new Scanner(new File("even.txt"));
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading even.txt");
        }
        System.out.println();

        // Step 3: Read and display odd.txt
        System.out.print("Odd File: ");
        // Read odd.txt and print its contents on a single line
        try {
            Scanner scanner = new Scanner(new File("odd.txt"));
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading odd.txt");
        }
        System.out.println();
    }
}
