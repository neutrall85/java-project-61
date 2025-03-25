package hexlet.code.Games;
import hexlet.code.Engine;

public class Even {
    public static void even() {

        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < Engine.round; i++) {
            Engine.question = Engine.num.nextInt(Engine.limit) + 1;
            System.out.println("Question: " + Engine.question);
            System.out.print("Your answer: ");
            Engine.answer = Engine.scan.next();
            if (Engine.question % 2 == 0 & Engine.answer.equals(Engine.result)
                    | Engine.question % 2 != 0 & Engine.answer.equals("no")) {
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
