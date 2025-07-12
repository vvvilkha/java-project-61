package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_TO_WIN = 3;

    public static void run(String gameDescription, String[][] roundsData) {
        String userName = greet();
        System.out.println(gameDescription);

        for (int i = 0; i < ROUNDS_TO_WIN; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static String greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
