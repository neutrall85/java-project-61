package hexlet.code;
import java.util.Scanner;
import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Gcd;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greeting");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int num = scanner.nextInt();
        System.out.println("Your choice " + num);
        if (num == 0) {
            scanner.close();
        } else if (num == 1) {
            Engine.greeting();
        } else if (num == 2) {
            Even.even();
        } else if (num == 3) {
            Calc.calc();
        } else if (num == 4) {
            Gcd.gcd();
        } else if (num == 5) {
            Progression.progression();
        } else if (num == 6) {
            Prime.prime();
        }
    }
}
