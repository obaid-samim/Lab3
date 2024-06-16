package exercise_2;

public abstract class GameTester {

    // Here is the Fields
    protected String  gameTesterName ;
    protected boolean  isFullTime;

    //Here is the Constructor
    public GameTester(String gameTesterName, boolean fullTimeStatus) {
        this.gameTesterName = gameTesterName;
        this.isFullTime = fullTimeStatus;
    }
    //Here is the getter mehtod
    public String getGameTesterName() {
        return gameTesterName;
    }

    public boolean isfullTimeStatus() {
        return isFullTime;
    }
    // Here is the abstract method
    public abstract double earnings();

}