package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void run(String gameDescription, String[] questions, String[] correctAnswers) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your choice: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", userAnswer, correctAnswers[i]);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
