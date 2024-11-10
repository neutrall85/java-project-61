package hexlet.code.games;
//import java.util.Arrays;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        int maxValue = 10;
        int[] progression = new int[maxValue];
        int answer;
        Random num = new Random();
        Scanner scan = new Scanner(System.in);

        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            int index = num.nextInt(maxValue);
            int firstNumber = num.nextInt(10) + 1;
            int progressionStep = num.nextInt(10) + 1;
            for (int j = 0; j < progression.length; j++) {
                progression[j] = firstNumber;
                firstNumber += progressionStep;
            }
            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < progression.length; k++) {
                if (k == index) {
                    builder.append("..");
                } else {
                    builder.append(progression[k]);
                }
                builder.append(" ");
            }
            System.out.println("Question: " + builder);
            answer = scan.nextInt();
            if (answer == progression[index]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + progression[index] + "'." + "\nLet's try again, ");
                break;
            }
        }
        //System.out.println(builder.toString());

    }
}
