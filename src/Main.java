public class Main {
    public static void main(String[] args) {

        ProfileSetUp profileSetUp = new ProfileSetUp();
        Profile profile1 = profileSetUp.promptInput(1);
        Profile profile2 = profileSetUp.promptInput(2);

        TotalMoneyRequired totalMoneyRequired = new TotalMoneyRequired(profile1, profile2);
        totalMoneyRequired.printWealthGoal();
    }
}
