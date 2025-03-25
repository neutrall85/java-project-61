package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int round = 3;
    public static int limit = 100;
    public static String name;
    public static int count = 0;
    public static String result = "yes";
    public static String answer = "";
    public static int question;
    public static Scanner scan = new Scanner(System.in);
    public static String operatorSwitch;
    public static int userAnswer;
    public static int correctResult = 0;
    public static Random num = new Random();
    public static int firstNumber;
    public static int secondNumber;
    public static Random operatorChoice = new Random();
    public static int operator;
    public static int maxValue = 10;
    public static int[] progression = new int[maxValue];
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void congrat() {
        count++;
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
            System.exit(0);
        }
    }
}
