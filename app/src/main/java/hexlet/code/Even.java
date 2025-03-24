package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Even {
    public static void even() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            Random num = new Random();
            String result = "yes";
            var question = num.nextInt(19) + 1;
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var answer = scan.next();
            if(question % 2 == 0 & answer.equals(result)
                    | question % 2 != 0 & answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                if(answer.equals("yes")) result = "no";
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'." + "\nLet's try again, ");
                break;
            }
            count++;
            if (count == 3) System.out.println("Congratulation, " + name);
        }
    }
}