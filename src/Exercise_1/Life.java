package Exercise_1;

class Life extends Insurance {

    public Life() {
        super("Life");
    }
    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getTypeOfInsurence());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}