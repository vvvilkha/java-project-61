package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static final int MAX_START = 50;
    private static final int MAX_STEP = 10;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int ROUNDS_COUNT = 3;

    public static void start() {
        String gameDescription = "What number is missing in the progression?";
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int start = random.nextInt(MAX_START);
            int step = random.nextInt(MAX_STEP - 1) + 1; // шаг не может быть нулевым
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;

            int hiddenIndex = random.nextInt(length);

            StringBuilder progression = new StringBuilder();
            int current = start;

            for (int j = 0; j < length; j++) {
                if (j == hiddenIndex) {
                    progression.append(".. ");
                    correctAnswers[i] = Integer.toString(current);
                } else {
                    progression.append(current).append(" ");
                }
                current += step;
            }

            questions[i] = progression.toString().trim();
        }

        Engine.run(gameDescription, questions, correctAnswers);
    }
}

