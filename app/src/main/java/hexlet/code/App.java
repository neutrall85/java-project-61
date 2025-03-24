package hexlet.code;
import java.util.Scanner;
import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
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
        }
    }
}
