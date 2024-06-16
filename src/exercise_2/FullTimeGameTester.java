package exercise_2;

public class FullTimeGameTester extends GameTester {

    //Here is the Field
    protected double baseSalary;

    //Here is the Constructor
    public FullTimeGameTester(String gameTesterName, boolean fullTimeStatus,double baseSalary) {
        super(gameTesterName, fullTimeStatus);
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
        this.isFullTime=true;
    }

    //Here is the setters methods
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    //Here is the getters mehtods
    public double getBaseSalary() {
        return baseSalary;
    }
    //Here is Implementing the abstract method  to return earnings
    @Override
    public double earnings() {
        return getBaseSalary();
    }

    // Here is method
    @Override
    public String toString()
    { return String.format("%s: %s%n%s: %s%n%s: %s%n",
            "Student Name",getGameTesterName(),"Full Time Tester",isfullTimeStatus(),"Base Salary",earnings());

    }

}