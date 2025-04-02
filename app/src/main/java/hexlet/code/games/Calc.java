package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int LIMIT = 100;
    private static final int OPERATOR_LIMIT = 3;
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final Random RAND = new Random();

    public static void calc() {
        var questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            var firstNumber = RAND.nextInt(LIMIT);
            var secondNumber = RAND.nextInt(LIMIT);
            var operator = RAND.nextInt(OPERATOR_LIMIT);
            questionsAnswers[i] = new String[]{firstNumber + " " + OPERATIONS[operator]
                    + " " + secondNumber, Integer.toString(calculate(firstNumber, operator, secondNumber))};
        }
        String rules = "What is the result of the expression?";
        Engine.common(rules, questionsAnswers);
    }
    public static int calculate(int firstNumber, int operator, int secondNumber) {
        int result = 0;

        switch (operator) {
            case 0:
                OPERATIONS[operator] = "+";
                result = firstNumber + secondNumber;
                break;
            case 1:
                OPERATIONS[operator] = "-";
                result = firstNumber - secondNumber;
                break;
            case 2:
                OPERATIONS[operator] = "*";
                result = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return result;
    }
}

