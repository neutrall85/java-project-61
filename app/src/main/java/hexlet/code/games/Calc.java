package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int limit = 10;
    private static final int operatorLimit = 3;
    private static final String[] operations = {"+", "-", "*"};

    public static void calc() {
        var questionsAnswers = new String[Engine.rounds][Engine.columns];

        for (int i = 0; i < Engine.rounds; i++) {
            var rand = new Random();
            var firstNumber = rand.nextInt(limit);
            var secondNumber = rand.nextInt(limit);
            var operator = rand.nextInt(operatorLimit);
            questionsAnswers[i] = new String[]{firstNumber + " " + operations[operator]
                    + " " + secondNumber, Integer.toString(calculate(firstNumber, operator, secondNumber))};
        }
        String rules = "What is the result of the expression?";
        Engine.common(rules, questionsAnswers);
    }
    public static int calculate(int firstNumber, int operator, int secondNumber) {
        int result = 0;

        switch (operator) {
            case 0:
                operations[operator] = "+";
                result = firstNumber + secondNumber;
                break;
            case 1:
                operations[operator] = "-";
                result = firstNumber - secondNumber;
                break;
            case 2:
                operations[operator] = "*";
                result = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return result;
    }
}

