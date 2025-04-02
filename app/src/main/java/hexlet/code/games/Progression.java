package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static int arrLength = 10;
    public static int limit = 100;

    public static void progression() {

        String[][] questionsAnswers = new String[Engine.rounds][Engine.columns];
        for (int i = 0; i < Engine.rounds; i++) {
            var rand = new Random();
            var index = rand.nextInt(arrLength);
            var firstNumber = rand.nextInt(limit);
            var progression = new int[arrLength];
            var progressionStep = rand.nextInt(arrLength);

            for (int j = 0; j < progression.length; j++) {
                progression[j] = firstNumber;
                firstNumber += progressionStep;
            }
            questionsAnswers[i] = new String[]{progress(progression, index),
                    Integer.toString(progression[index])};
        }
        String rules = "What number is missing in the progression?";
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









