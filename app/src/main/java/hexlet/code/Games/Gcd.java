package hexlet.code.Games;
import hexlet.code.Engine;

public class Gcd {
    public static void gcd() {

        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < Engine.round; i++) {
            Engine.firstNumber = Engine.num.nextInt(Engine.limit);
            Engine.secondNumber = Engine.num.nextInt(Engine.limit);
            System.out.println("Question: " + Engine.firstNumber + " " + Engine.secondNumber);
            System.out.print("Your answer: ");
            Engine.userAnswer = Engine.scan.nextInt();
            if (Engine.firstNumber < Engine.secondNumber) {
                int tempNumber = Engine.firstNumber;
                Engine.firstNumber = Engine.secondNumber;
                Engine.secondNumber = tempNumber;
            }
            while (Engine.secondNumber != 0) {
                Engine.correctResult = Engine.firstNumber % Engine.secondNumber;
                Engine.firstNumber = Engine.secondNumber;
                Engine.secondNumber = Engine.correctResult;
            }
            if (Engine.userAnswer == Engine.firstNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + Engine.userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + Engine.firstNumber + "'." + "\nLet's try again, " + Engine.name + "!");
                break;
            }
            Engine.congrat();
        }
    }
}
