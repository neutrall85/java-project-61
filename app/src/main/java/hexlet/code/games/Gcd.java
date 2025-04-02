package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static int limit = 100;

    public static void gcd() {
        var questionsAnswers = new String[Engine.rounds][Engine.columns];
        for (int i = 0; i < Engine.rounds; i++) {
            var rand = new Random();
            var firstNumber = rand.nextInt(limit) + 1;
            var secondNumber = rand.nextInt(limit) + 1;
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
