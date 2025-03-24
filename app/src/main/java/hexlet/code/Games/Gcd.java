package hexlet.code.Games;
import hexlet.code.Engine;

public class Gcd extends Engine {
    public static void gcd() {

        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            firstNumber = num.nextInt(100) + 1;
            secondNumber = num.nextInt(100) + 1;
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            userAnswer = scan.nextInt();
            if (firstNumber < secondNumber) {
                int tempNumber = firstNumber;
                firstNumber = secondNumber;
                secondNumber = tempNumber;
            }
            while (secondNumber != 0) {
                correctResult = firstNumber % secondNumber;
                firstNumber = secondNumber;
                secondNumber = correctResult;
            }
            if (userAnswer == firstNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + firstNumber + "'." + "\nLet's try again, " + name + "!");
                break;
            }
            Engine.congrat();
        }
    }
}
