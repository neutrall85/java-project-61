package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final int LIMIT = 100;

    public static void even() {
        var questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            var number = new Random().nextInt(LIMIT);
            if (number % 2 == 0) {
                questionsAnswers[i] = new String[]{Integer.toString(number), YES};
            } else {
                questionsAnswers[i] = new String[]{Integer.toString(number), NO};
            }
        }
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.common(rules, questionsAnswers);
    }
}
