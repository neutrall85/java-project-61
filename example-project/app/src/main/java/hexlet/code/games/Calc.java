package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void calc() {
        Scanner scan = new Scanner(System.in);
        String operatorSwitch;
        int answer;
        int result = 0;
        Engine.greeting();
        Random num = new Random();
        int firstNumber;
        int secondNumber;
        Random operatorChoice = new Random();
        int operator;
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {
            firstNumber = num.nextInt(11) + 1;
            secondNumber = num.nextInt(11) + 1;
            operator = operatorChoice.nextInt(3);

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
            System.out.println("Question: " + firstNumber + operatorSwitch + secondNumber);
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
