package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final int LIMIT = 100;
    private static final Random RAND = new Random();
    private static final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {
        String[][] questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = RAND.nextInt(LIMIT) + 1;
            if (isPrime(number)) {
                questionsAnswers[i] = new String[]{Integer.toString(number), NO};
            } else {
                questionsAnswers[i] = new String[]{Integer.toString(number), YES};
            }
        }
        Engine.common(rules, questionsAnswers);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return true;
            }
        }
        return false;
    }
}
