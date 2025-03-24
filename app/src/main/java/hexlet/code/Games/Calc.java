package hexlet.code.Games;
import hexlet.code.Engine;

public class Calc extends Engine {
    public static void calc() {

        Engine.greeting();

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {
            firstNumber = num.nextInt(11) + 1;
            secondNumber = num.nextInt(11) + 1;
            operator = operatorChoice.nextInt(3);

            switch (operator) {
                case 0:
                    operatorSwitch = "+";
                    correctResult = firstNumber + secondNumber;
                    break;
                case 1:
                    operatorSwitch = "-";
                    correctResult = firstNumber - secondNumber;
                    break;
                case 2:
                    operatorSwitch = "*";
                    correctResult = firstNumber * secondNumber;
                    break;
                default:
                    operatorSwitch = "";
            }
            System.out.println("Question: " + firstNumber + operatorSwitch + secondNumber);
            userAnswer = scan.nextInt();

            if (userAnswer == correctResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'." + "\nLet's try again, " + name + "!");
                break;
            }
            Engine.congrat();

        }
    }
}
