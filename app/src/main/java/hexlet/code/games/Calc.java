package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int LIMIT = 100;
    private static final int OPERATOR_LIMIT = 3;
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final Random RAND = new Random();
    private static final String RULES = "What is the result of the expression?";

    public static void playCalc() {
        var questionsAnswers = new String[Engine.ROUNDS][Engine.COLUMNS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            var firstNumber = RAND.nextInt(LIMIT);
            var secondNumber = RAND.nextInt(LIMIT);
            var operator = RAND.nextInt(OPERATOR_LIMIT);
            var op = OPERATIONS[operator];
            var answer = Integer.toString(calculate(firstNumber, operator, secondNumber));
            questionsAnswers[i] = new String[]{firstNumber + " " + op + " " + secondNumber, answer};
        }
        Engine.common(RULES, questionsAnswers);
    }
    public static int calculate(int firstNumber, int operator, int secondNumber) {
        int result;

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
                throw new RuntimeException("Unknown state!");
        }
        return result;
    }
}

