package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    protected static String name;
    protected static int count = 0;
    protected static String result = "yes";
    protected static String answer = "";
    protected static int question;
    protected static Scanner scan = new Scanner(System.in);
    protected static String operatorSwitch;
    protected static int userAnswer;
    protected static int correctResult = 0;
    protected static Random num = new Random();
    protected static int firstNumber;
    protected static int secondNumber;
    protected static Random operatorChoice = new Random();
    protected static int operator;
    protected static int maxValue = 10;
    protected static int[] progression = new int[maxValue];
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void congrat() {
        count++;
        if (count == 3) {
            System.out.println("Congratulation, " + name);
        }
    }
}
