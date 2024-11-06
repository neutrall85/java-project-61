package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String name;
    public static int count = 0;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
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
