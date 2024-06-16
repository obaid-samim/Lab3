package exercise_3;
import java.util.Scanner;

public class ProcessMortgageDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialize Scanner to read user input
        Mortgage[] mortgages = new Mortgage[3]; // Create an array to hold 3 Mortgage objects

        // Prompt user to enter the current prime interest rate
        System.out.print("Enter the current prime interest rate: ");
        double primeRate = input.nextDouble();

        // Loop to collect details for each mortgage
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter details for mortgage " + (i + 1) + ":");

            // Prompt user to enter mortgage number
            System.out.print("Enter mortgage number: ");
            String mortgageNumber = input.next();

            // Prompt user to enter customer name
            System.out.print("Enter customer name: ");
            String customerName = input.next();

            // Prompt user to enter mortgage amount
            System.out.print("Enter mortgage amount: ");
            double amount = input.nextDouble();

            // Prompt user to enter term (1 for short-term, 3 for medium-term, 5 for long-term)
            System.out.print("Enter term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = input.nextInt();

            // Prompt user to enter mortgage type (1 for Business, 2 for Personal)
            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int mortgageType = input.nextInt();

            // Create a BusinessMortgage or PersonalMortgage object based on user input
            if (mortgageType == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else if (mortgageType == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type.");
                i--; // Decrement counter to retry this entry
            }
        }

        // Display information for all mortgages
        System.out.println("\nAll Mortgages:");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
        }

        input.close(); // Close the Scanner
    }
}