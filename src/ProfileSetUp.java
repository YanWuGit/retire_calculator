import java.util.Scanner;

public class ProfileSetUp {

    public Profile promptInput(int i){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input information for person " + i + ":");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Sexuality: (M/F)");
        String sexuality = scanner.nextLine();
        System.out.println("Age:");
        int currentAge = scanner.nextInt();
        System.out.println("Desired retiring age:");
        int retireAge = scanner.nextInt();
        System.out.println("How much money do you spend each year: (exclude any sort of investment such as " +
                "buying stock or paying mortgage)");
        double currentLivingExpense = scanner.nextDouble();
        System.out.println("Congratulations, " + name + "! Your profile has been set up.");

        Profile profile = new Profile(name, sexuality, currentAge, retireAge, currentLivingExpense);

        return profile;
    }
}
