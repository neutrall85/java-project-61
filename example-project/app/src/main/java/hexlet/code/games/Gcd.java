package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Gcd {
    public static void gcd() {
        Scanner scan = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        Random num = new Random();
        int answer;
        int result;

        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            firstNumber = num.nextInt(100) + 1;
            secondNumber = num.nextInt(100) + 1;
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            if (firstNumber < secondNumber) {
                int tempNumber = firstNumber;
                firstNumber = secondNumber;
                secondNumber = tempNumber;
            }
            while(secondNumber != 0) {
                result = firstNumber % secondNumber;
                firstNumber = secondNumber;
                secondNumber = result;
            }
            if (answer == firstNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + firstNumber + "'." + "\nLet's try again, ");
                break;
            }
            Engine.congrat();
        }
    }
}
