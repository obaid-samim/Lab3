package exercise_3;

public class BusinessMortgage extends Mortgage {
    // Constructor to initialize the BusinessMortgage with an interest rate 1% over the prime rate
    public BusinessMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 1, term);
    }
}