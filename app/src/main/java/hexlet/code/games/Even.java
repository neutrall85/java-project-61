package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final int LIMIT = 100;
    private static final Random RAND = new Random();
    private static final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {
        var questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            var number = RAND.nextInt(LIMIT);
            if (number % 2 == 0) {
                questionsAnswers[i] = new String[]{Integer.toString(number), YES};
            } else {
                questionsAnswers[i] = new String[]{Integer.toString(number), NO};
            }
        }
        Engine.common(rules, questionsAnswers);
    }
}
