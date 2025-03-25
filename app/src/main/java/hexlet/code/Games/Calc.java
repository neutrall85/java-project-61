package hexlet.code.Games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {

        Engine.greeting();

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.round; i++) {
            Engine.firstNumber = Engine.num.nextInt(Engine.limit);
            Engine.secondNumber = Engine.num.nextInt(Engine.limit);
            Engine.operator = Engine.operatorChoice.nextInt(3);

            switch (Engine.operator) {
                case 0:
                    Engine.operatorSwitch = "+";
                    Engine.correctResult = Engine.firstNumber + Engine.secondNumber;
                    break;
                case 1:
                    Engine.operatorSwitch = "-";
                    Engine.correctResult = Engine.firstNumber - Engine.secondNumber;
                    break;
                case 2:
                    Engine.operatorSwitch = "*";
                    Engine.correctResult = Engine.firstNumber * Engine.secondNumber;
                    break;
                default:
                    Engine.operatorSwitch = "";
            }
            System.out.println("Question: " + Engine.firstNumber + " "
                    + Engine.operatorSwitch + " " + Engine.secondNumber);
            Engine.userAnswer = Engine.scan.nextInt();

            if (Engine.userAnswer == Engine.correctResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + Engine.userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + Engine.result + "'." + "\nLet's try again, " + Engine.name + "!");
                System.exit(0);
            }
            Engine.congrat();

        }
    }
}
