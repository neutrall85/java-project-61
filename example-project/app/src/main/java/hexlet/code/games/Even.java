package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Random random = new Random();
        String result = "yes";
        String answer = "";
        int question;
        Scanner scan = new Scanner(System.in);

        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 0; i < 3; i++) {
            question = random.nextInt(19) + 1;
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            answer = scan.next();
            if (question % 2 == 0 & answer.equals(result)
                    | question % 2 != 0 & answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    result = "no";
                }
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'." + "\nLet's try again, ");
                break;
            }
            Engine.congrat();
        }
    }
}
