package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int COLUMNS = 2;

    public static void common(String rules, String[][] table) {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.println("Hello," + " " + name + "!");

        System.out.println(rules);
        for (int i = 0; i < table.length; i++) {
            System.out.println("Question: " + table[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (table[i][1].equals(answer)) {
                String result = "Correct!";
                System.out.println(result);
            } else {
                System.out.println(answer + " " + "is wrong answer ;(. Correct answer was" + " "
                        + table[i][1] + ".\n" + "Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
        System.exit(0);
    }
}
