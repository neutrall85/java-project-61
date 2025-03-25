package hexlet.code.Games;
import hexlet.code.Engine;

public class Progression {
    public static void progression() {

        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.round; i++) {
            int index = Engine.num.nextInt(Engine.maxValue);
            int firstNumber = Engine.num.nextInt(Engine.limit);
            int progressionStep = Engine.num.nextInt(10);
            for (int j = 0; j < Engine.progression.length; j++) {
                Engine.progression[j] = firstNumber;
                firstNumber += progressionStep;
            }
            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < Engine.progression.length; k++) {
                if (k != index) {
                    builder.append(Engine.progression[k]);
                } else {
                    builder.append("..");
                }
                builder.append(" ");
            }
            System.out.println("Question: " + builder);
            Engine.userAnswer = Engine.scan.nextInt();
            if (Engine.userAnswer == Engine.progression[index]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + Engine.userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + Engine.progression[index] + "'." + "\nLet's try again, " + Engine.name + "!");
                System.exit(0);
            }
            Engine.congrat();
        }

    }
}
