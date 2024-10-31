import java.util.Scanner;

public class GreetingAndAge {
    public static void main(String[] args) {
        // Create a Scanner object for getting user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate years left until 100
        int yearsLeft = 100 - age;

        // Output the greeting and age information
        System.out.println("Hello, " + name + "!");
        System.out.println("You will turn 100 in " + yearsLeft + " years.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
