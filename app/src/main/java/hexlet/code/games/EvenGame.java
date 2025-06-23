package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int ROUNDS_TO_WIN = 3;

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void play(){
        String name = Cli.greetUser();
        Random random = new Random();
        int correctAnswers = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (correctAnswers < ROUNDS_TO_WIN) {
           int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine().trim().toLowerCase();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.printf("'%s' is an invalid answer. Let's try again, %s!%n", answer, name);
                return;
            }

            String correctAnswer = isEven(number) ?  "yes" : "no";

            if (!answer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", name);
                return;

            }
            System.out.println("Correct!");
            correctAnswers++;
        }
        System.out.printf("Congratulations, %s!%n", name);
    }
}
