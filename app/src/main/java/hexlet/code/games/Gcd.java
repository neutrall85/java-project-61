package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final int LIMIT = 100;
    private static final Random RAND = new Random();
    private static final String rules = "Find the greatest common divisor of given numbers.";

    public static void playGcd() {
        var questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            var firstNumber = RAND.nextInt(LIMIT) + 1;
            var secondNumber = RAND.nextInt(LIMIT) + 1;
            questionsAnswers[i] = new String[]{firstNumber
                    + " " + secondNumber, Integer.toString(findGcd(firstNumber, secondNumber))};
        }
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
