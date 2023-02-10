import java.util.Scanner;

public class Profile {
    private String name;
    private String sexuality;
    private int currentAge;
    private int retireAge;
    private double currentLivingExpense;
    private double lifeExpectancyMale = 73.2;
    private double lifeExpectancyFemale = 79.1;

    public Profile(String name, String sexuality, int currentAge, int retireAge, double currentLivingExpense) {
        this.name = name;
        this.sexuality = sexuality;
        this.currentAge = currentAge;
        this.retireAge = retireAge;
        this.currentLivingExpense = currentLivingExpense;

    }


    public double calRetirementYears(){
        double lifeExpectancy = 0;
        if (sexuality.equals("M")){
            lifeExpectancy = lifeExpectancyMale;
        } else {
            lifeExpectancy = lifeExpectancyFemale;
        }

        double retirementYears = lifeExpectancy - retireAge;
        return retirementYears;
    }


    // s & g
    public String getName() {
        return name;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public int getRetireAge() {
        return retireAge;
    }

    public double getCurrentLivingExpense() {
        return currentLivingExpense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public void setRetireAge(int retireAge) {
        this.retireAge = retireAge;
    }

    public void setCurrentLivingExpense(double currentLivingExpense) {
        this.currentLivingExpense = currentLivingExpense;
    }

    public String getSexuality() {
        return sexuality;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }
}
