package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
                Your choice\s""");
        int num = scanner.nextInt();
        if (num == 0) {
            scanner.close();
        } else if (num == 1) {
            Cli.greeting();
        } else if (num == 2) {
            Even.even();
        } else if (num == 3) {
            Calc.calc();
        } else if (num == 4) {
            Gcd.gcd();
        }
    }
}
