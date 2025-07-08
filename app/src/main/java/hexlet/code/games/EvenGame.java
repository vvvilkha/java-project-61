package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void start() {

        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER);
            questions[i] = Integer.toString(number);
            correctAnswers[i] = (number % 2 == 0) ? "yes" : "no";
        }
        Engine.run(gameDescription, questions, correctAnswers);
    }
}
