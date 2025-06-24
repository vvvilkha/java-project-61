package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public final class ProgressionGame implements Game {
    private final Random random = new Random();
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 6;
    private static final int MAX_START_VALUE = 100;
    private static final int MAX_RANDOM_VALUE = 100;
    private int correctAnswer;

    public String getQuestion() {
        int length = random.nextInt(MAX_LENGTH)+MIN_LENGTH;
        int start = random.nextInt(MAX_START_VALUE);
        int maxStep = (MAX_RANDOM_VALUE - start) / (length - 1);
        if (maxStep <= 0) {
            maxStep = 1;
        }
        int step = random.nextInt(maxStep) + 1;
        int hiddenIndex = random.nextInt(length);

        return createProgression(start, step, length, hiddenIndex);
    }

    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer);
    }

    public void start() {
        System.out.println("What number is missing in the progression?");
    }
    private String createProgression(int start, int step, int length, int hiddenIndex) {
        StringBuilder progression = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == hiddenIndex) {
                progression.append(".. ");
                correctAnswer = start + i * step;
            } else {
                progression.append(start + i * step).append(" ");
            }
        }
        return progression.toString().trim();
    }
}

