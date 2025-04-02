package hexlet.code.Games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static String yes = "yes";
    public static String no = "no";
    public static int limit = 100;
    public static void even() {
        var questionsAnswers = new String[Engine.rounds][Engine.columns];
        for (int i = 0; i < Engine.rounds; i++) {
            var number = new Random().nextInt(limit);
            if (number % 2 == 0) {
                questionsAnswers[i] = new String[]{Integer.toString(number), yes};
            } else {
                questionsAnswers[i] = new String[]{Integer.toString(number), no};
            }
        }
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.common(rules, questionsAnswers);
    }
}
