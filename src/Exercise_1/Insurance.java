package Exercise_1;

public abstract class Insurance {
    //Here is fields
    protected String TypeOfInsurence;
    protected double monthlyCost;

    //Here is constructors
    public Insurance(String typeOfInsurence){
        this.TypeOfInsurence = typeOfInsurence;
    }
    //Here is Getter and Setter
    public String getTypeOfInsurence() {
        return TypeOfInsurence;
    }
    public double getMonthlyCost(){
        return     monthlyCost;
    }
    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    // Here is Abstract methods
    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();


}
