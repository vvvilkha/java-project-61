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
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int start = random.nextInt(MAX_START);
            int step = random.nextInt(MAX_STEP - 1) + 1;
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int[] progression = generateProgression(start, step, length);

            int hiddenIndex = random.nextInt(length);
            String question = buildQuestion(progression, hiddenIndex);
            String correctAnswer = String.valueOf(progression[hiddenIndex]);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.run(gameDescription, roundsData);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]).append(" ");
            }
        }
        return question.toString().trim();
    }
}

