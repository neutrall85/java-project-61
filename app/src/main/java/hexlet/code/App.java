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
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice\s""");
        int num = scanner.nextInt();
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
