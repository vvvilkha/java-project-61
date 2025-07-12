package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String question = Integer.toString(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(gameDescription, roundsData);
    }
}

