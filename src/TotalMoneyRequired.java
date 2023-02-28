public class TotalMoneyRequired {
    private double wealthGoal; //inflation counted
    private Profile profile1;
    private Profile profile2;
    private static double inflationRate = 0.04;

    public TotalMoneyRequired(Profile profile1, Profile profile2) {
        this.profile1 = profile1;
        this.profile2 = profile2;
        wealthGoal = genWealthGoal();
    }

    public static double genWealthGoalForOne(Profile profile){
        double retirementYears = profile.calRetirementYears();
        double yearlyExpenses = profile.getCurrentLivingExpense();
        double yearsToRetirement = profile.getRetireAge() - profile.getCurrentAge();
        double wealthGoal = retirementYears * yearlyExpenses * Math.pow((1+inflationRate), yearsToRetirement);
        System.out.println(profile.getName() + " need $" + wealthGoal + "for retirement.");
        return wealthGoal;
    }//generates wealth goal for one profile(person)


    public double genWealthGoal(){
        return genWealthGoalForOne(profile1) + genWealthGoalForOne(profile2);
    }

    public void printWealthGoal(){
        System.out.println("You need a total of $" + wealthGoal + " for both of your retirements.");
    }


}
