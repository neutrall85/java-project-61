package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int ARR_LENGTH = 10;
    private static final int LIMIT = 100;
    private static final Random RAND = new Random();
    private static final String rules = "What number is missing in the progression?";

    public static void playProgression() {

        String[][] questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            var index = RAND.nextInt(ARR_LENGTH);
            var firstNumber = RAND.nextInt(LIMIT);
            var progression = new int[ARR_LENGTH];
            var progressionStep = RAND.nextInt(ARR_LENGTH);

            for (int j = 0; j < progression.length; j++) {
                progression[j] = firstNumber;
                firstNumber += progressionStep;
            }
            questionsAnswers[i] = new String[]{progress(progression, index),
                    Integer.toString(progression[index])};
        }
        Engine.common(rules, questionsAnswers);
    }

    public static String progress(int[] progression, int index) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i != index) {
                builder.append(progression[i]);
            } else {
                builder.append("..");
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}









