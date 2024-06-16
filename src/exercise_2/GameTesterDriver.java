package exercise_2;
import java.util.Scanner;

public class GameTesterDriver {
    public static void main(String[] args) {
        // Here is Create an array to hold GameTester objects
        GameTester[] gameTester = new GameTester[2];
        // Here is Initialize Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Here is Loop to collect data for each GameTester
        for (int i = 0; i < gameTester.length; i++) {
            // Here is Prompt user for name
            System.out.print("Please enter your name: ");
            String name = input.next();

            // Prompt user to indicate if they are a full-time tester
            System.out.print("Are you a full-time tester: True/False? ");
            boolean type = input.nextBoolean();

            // Create a FullTimeGameTester if type is true
            if (type == true) {
                FullTimeGameTester fullTimeGameTester = new FullTimeGameTester(name, type, 3000);
                gameTester[i] = fullTimeGameTester;
                // Display the information of the full-time game tester
                System.out.println(fullTimeGameTester.toString());
            }
            // Create a PartTimeGameTester if type is false
            else if (type == false) {
                // Prompt user for hours worked per week
                System.out.print("How many hours do you work per week? ");
                double hours = input.nextDouble();

                PartTimeGameTester partTimeGameTester = new PartTimeGameTester(name, type, 20, hours);
                gameTester[i] = partTimeGameTester;
                // Display the information of the part-time game tester
                System.out.println(partTimeGameTester.toString());
            }
            // Handle invalid input for the type of tester
            else {
                System.out.print("Please enter a valid input!");
                break;
            }
        }

        // Display details of all game testers
        System.out.println("Details of testers are displayed below:");
        for (int i = 0; i < gameTester.length; i++) {
            System.out.println(gameTester[i].toString());
        }

        // Close the scanner
        input.close();
    }
}