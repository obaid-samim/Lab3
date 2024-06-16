package exercise_3;

public abstract class Mortgage implements MortgageConstants {
    private String mortgageNumber; // Unique identifier for the mortgage
    private String customerName; // Name of the customer
    private double amount; // Amount of the mortgage
    private double interestRate; // Interest rate for the mortgage
    private int term; // Term of the mortgage in years

    // Constructor to initialize the mortgage details
    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        // Ensure the mortgage amount does not exceed the maximum allowed
        if (amount > MAX_MORTGAGE_AMOUNT) {
            throw new IllegalArgumentException("Mortgage amount cannot exceed " + MAX_MORTGAGE_AMOUNT);
        }
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amount = amount;
        this.interestRate = interestRate;

        // Force any invalid term to be short-term (one year)
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    //Getter Method to display all mortgage data
    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Amount: $" + amount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " years\n" +
                "Total Owed: $" + (amount + (amount * interestRate / 100 * term)) + "\n";
    }
}