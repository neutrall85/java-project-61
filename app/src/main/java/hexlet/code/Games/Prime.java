package hexlet.code.Games;
import hexlet.code.Engine;

public class Prime extends Engine {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return true;
            }
        }
        return false;
    }

    public static void prime() {
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            question = num.nextInt(100);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            answer = scan.next();
            if (isPrime(question) && answer.equals("no") || !isPrime(question) && answer.equals("yes")) {
                System.out.println("Correct!");
            } else {
                if (answer.equals("yes")) {
                    result = "no";
                }
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'." + "\nLet's try again, " + name + "!");
                break;
            }
            Engine.congrat();
        }
    }
}
