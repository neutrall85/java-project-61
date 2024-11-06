package hexlet.code.games;
//import hexlet.code.Engine;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void calc() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String operatorSwitch;
        int answer;
        int result = 0;
        for (int i = 0; i < 3; i++) {
            Random num = new Random();
            int firstNumber = num.nextInt(11) + 1;
            int secondNumber = num.nextInt(11) + 1;
            Random operatorChoice = new Random();
            int operator = operatorChoice.nextInt(3);

            switch (operator) {
                case 0:
                    operatorSwitch = "+";
                    result = firstNumber + secondNumber;
                    break;
                case 1:
                    operatorSwitch = "-";
                    result = firstNumber - secondNumber;
                    break;
                case 2:
                    operatorSwitch = "*";
                    result = firstNumber * secondNumber;
                    break;
                default:
                    operatorSwitch = "";
            }
            var question = firstNumber + operatorSwitch + secondNumber;
            System.out.println("Question: " + question);
            answer = scan.nextInt();

            if (answer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'." + "\nLet's try again, ");
                break;
            }
            Engine.congrat();

        }
    }
}
