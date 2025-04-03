package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    private static final int CHOICE0 = 0;
    private static final int CHOICE1 = 1;
    private static final int CHOICE2 = 2;
    private static final int CHOICE3 = 3;
    private static final int CHOICE4 = 4;
    private static final int CHOICE5 = 5;
    private static final int CHOICE6 = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greeting");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice ");
        int num = scanner.nextInt();

        if (num == CHOICE0) {
            scanner.close();
        } else if (num == CHOICE1) {
            Cli.greeting();
        } else if (num == CHOICE2) {
            Even.playEven();
        } else if (num == CHOICE3) {
            Calc.playCalc();
        } else if (num == CHOICE4) {
            Gcd.playGcd();
        } else if (num == CHOICE5) {
            Progression.playProgression();
        } else if (num == CHOICE6) {
            Prime.playPrime();
        }
    }
}
