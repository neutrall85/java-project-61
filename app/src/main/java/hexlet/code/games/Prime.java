package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static String yes = "yes";
    public static String no = "no";
    public static int limit = 100;

    public static void prime() {
        String[][] questionsAnswers = new String[Engine.rounds][Engine.columns];
        for (int i = 0; i < Engine.rounds; i++) {
            int number = new Random().nextInt(limit) + 1;
            if (isPrime(number)) {
                questionsAnswers[i] = new String[]{Integer.toString(number), no};
            } else {
                questionsAnswers[i] = new String[]{Integer.toString(number), yes};
            }
        }
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
