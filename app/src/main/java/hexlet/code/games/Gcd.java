package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final int LIMIT = 100;

    public static void gcd() {
        var questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            var rand = new Random();
            var firstNumber = rand.nextInt(LIMIT) + 1;
            var secondNumber = rand.nextInt(LIMIT) + 1;
            questionsAnswers[i] = new String[]{firstNumber
                    + " " + secondNumber, Integer.toString(findGcd(firstNumber, secondNumber))};
        }
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.common(rules, questionsAnswers);
    }
    public static int findGcd(int firstNumber, int secondNumber) {

        while (secondNumber != 0) {
            int result = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        return firstNumber;
    }
}
