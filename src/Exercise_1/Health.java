package Exercise_1;

//Here is the Inheritance
public class Health extends Insurance {

    public Health() {
        super("Health");
    }

    //Here the insurence cost from super class inheritance]
    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);
    }
    //Here is display information
    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getTypeOfInsurence());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}

