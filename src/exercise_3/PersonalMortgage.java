package exercise_3;

public class PersonalMortgage extends Mortgage {
    // Constructor to initialize the PersonalMortgage with an interest rate 2% over the prime rate
    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 2, term);
    }
}