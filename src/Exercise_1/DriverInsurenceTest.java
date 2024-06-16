package Exercise_1;
import java.util.Scanner;

public class DriverInsurenceTest {
    public static void main(String[] args) {
        //Here is the auto-generate methods

        Scanner scanner = new Scanner(System.in);
        Insurance[] insurances = new Insurance[10]; // Assuming a maximum of 10 insurances
        int count = 0;

        while (true) {
            System.out.println("Enter type of insurance (Health or Life) or 'exit' to finish:");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the monthly fee:");
            double fee = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Insurance insurance = null;
            if (type.equalsIgnoreCase("Health")) {
                insurance = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                insurance = new Life();
            }

            if (insurance != null) {
                insurance.setInsuranceCost(fee);
                insurances[count++] = insurance;
            } else {
                System.out.println("Invalid insurance type. Please enter either 'Health' or 'Life'.");
            }
        }

        System.out.println("\nInsurance Information:");
        for (int i = 0; i < count; i++) {
            insurances[i].displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}