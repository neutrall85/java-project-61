package hexlet.code.Games;
import hexlet.code.Engine;

public class Progression extends Engine {
    public static void progression() {

        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            int index = num.nextInt(maxValue);
            int firstNumber = num.nextInt(10);
            int progressionStep = num.nextInt(10);
            for (int j = 0; j < progression.length; j++) {
                progression[j] = firstNumber;
                firstNumber += progressionStep;
            }
            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < progression.length; k++) {
                if (k != index) {
                    builder.append(progression[k]);
                } else {
                    builder.append("..");
                }
                builder.append(" ");
            }
            System.out.println("Question: " + builder);
            userAnswer = scan.nextInt();
            if (userAnswer == progression[index]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + progression[index] + "'." + "\nLet's try again, ");
                break;
            }
            Engine.congrat();
        }

    }
}
