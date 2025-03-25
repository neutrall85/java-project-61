package hexlet.code.Games;
import hexlet.code.Engine;

public class Prime {
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
        for (int i = 0; i < Engine.round; i++) {
            Engine.question = Engine.num.nextInt(Engine.limit);
            System.out.println("Question: " + Engine.question);
            System.out.print("Your answer: ");
            Engine.answer = Engine.scan.next();
            if (isPrime(Engine.question) && Engine.answer.equals("no")
                    || !isPrime(Engine.question) && Engine.answer.equals("yes")) {
                System.out.println("Correct!");
            } else {
                if (Engine.answer.equals("yes")) {
                    Engine.result = "no";
                }
                System.out.println("'" + Engine.answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + Engine.result + "'." + "\nLet's try again, " + Engine.name + "!");
                break;
            }
            Engine.congrat();
        }
    }
}
