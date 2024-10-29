package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Scanner scan = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        Random random = new Random();
        int count = 0;
        String wrongAnswer;
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (randomNumber % 2 == 0 & answer.equals("yes")
                | randomNumber % 2 != 0 & answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    wrongAnswer = "no";
                } else {
                    wrongAnswer = "yes";
                }
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + wrongAnswer + "'." + "\nLet's try again, ");
                break;
            }
            count++;
            if (count == 3) {
                System.out.println("Congratulation, " + name);
            }
        }
    }
}
